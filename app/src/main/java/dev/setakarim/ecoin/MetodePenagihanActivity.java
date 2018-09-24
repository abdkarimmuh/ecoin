package dev.setakarim.ecoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

import dev.setakarim.ecoin.Loop.NFCActivity;
import dev.setakarim.ecoin.Loop.QRCodeActivity;
import dev.setakarim.ecoin.Menu.TagihUangActivity;

public class MetodePenagihanActivity extends AppCompatActivity {

    private TextView txt_jml;
    private int option = 0;
    private CardView cv_nfc, cv_qr, cv_dokumen;
    private ImageView checklist_nfc, checklist_qr, checklist_dokumen;
    private View btn_lanjut, btn_batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_penagihan);

        cv_nfc = findViewById(R.id.cv_nfc);
        cv_qr = findViewById(R.id.cv_qr);
        cv_dokumen = findViewById(R.id.cv_dokumen);
        checklist_nfc = findViewById(R.id.checklist_nfc);
        checklist_qr = findViewById(R.id.checklist_qr);
        checklist_dokumen = findViewById(R.id.checklist_dokumen);
        btn_lanjut = findViewById(R.id.btn_lanjut);
        btn_batal = findViewById(R.id.btn_batal);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("METODE PENAGIHAN");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        txt_jml = findViewById(R.id.txt_jml);

        String jml = getIntent().getStringExtra("jumlah");

        if(!jml.isEmpty()){
            NumberFormat formatter = new DecimalFormat("#,###");
            Double jumlah = (Double.parseDouble(jml));
            String formattedNumber = formatter.format(jumlah);

            txt_jml.setText("Rp. " + formattedNumber);
        }

        cv_nfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != 1) {
                    checklist_nfc.setVisibility(View.VISIBLE);
                    checklist_qr.setVisibility(View.GONE);
                    checklist_dokumen.setVisibility(View.GONE);
                    option = 1;
                } else {
                    checklist_nfc.setVisibility(View.GONE);
                    option = 0;
                }
            }
        });

        cv_qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != 2) {
                    checklist_nfc.setVisibility(View.GONE);
                    checklist_qr.setVisibility(View.VISIBLE);
                    checklist_dokumen.setVisibility(View.GONE);
                    option = 2;
                } else {
                    checklist_qr.setVisibility(View.GONE);
                    option = 0;
                }
            }
        });

        cv_dokumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option != 3) {
                    checklist_nfc.setVisibility(View.GONE);
                    checklist_qr.setVisibility(View.GONE);
                    checklist_dokumen.setVisibility(View.VISIBLE);
                    option = 3;
                } else {
                    checklist_dokumen.setVisibility(View.GONE);
                    option = 0;
                }
            }
        });

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option == 1) {
                    Intent intent = new Intent(MetodePenagihanActivity.this, NFCActivity.class);
                    startActivity(intent);
                } else if (option == 2) {
                    Intent intent = new Intent(MetodePenagihanActivity.this, QRCodeActivity.class);
                    startActivity(intent);
                } else if (option == 3) {
                    Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                    sharingIntent.setType("text/plain");
                    String shareBody = "Tagih uang sebesar "+ txt_jml.getText().toString() + " melalui aplikasi ecoin";
                    sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Tagih Uang");
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                    startActivity(Intent.createChooser(sharingIntent, "Share via"));
                }
            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MetodePenagihanActivity.this, TagihUangActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
