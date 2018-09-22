package dev.setakarim.ecoin.Pembayaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import dev.setakarim.ecoin.R;

public class KonfirmasiPembayaranActivity extends AppCompatActivity {

    private TextView txt_jml, txt_mail;
    private View btn_lanjut, btn_batal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konfirmasi_pembayaran);

        txt_jml = findViewById(R.id.txt_jml);
        txt_mail = findViewById(R.id.txt_mail);
        btn_batal = findViewById(R.id.btn_batal);
        btn_lanjut = findViewById(R.id.btn_lanjut);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("KONFIRMASI PEMBAYARAN");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        txt_jml.setText(getIntent().getStringExtra("jumlah"));
        txt_mail.setText(getIntent().getStringExtra("tujuan"));

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KonfirmasiPembayaranActivity.this, DoneKonfirmasiPembayaranActivity.class);
                intent.putExtra("jumlah", txt_jml.getText().toString());
                intent.putExtra("tujuan", txt_mail.getText().toString());
                startActivity(intent);
            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KonfirmasiPembayaranActivity.this, PembayaranActivity.class);
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
