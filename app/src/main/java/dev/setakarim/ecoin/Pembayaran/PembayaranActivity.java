package dev.setakarim.ecoin.Pembayaran;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import dev.setakarim.ecoin.Menu.KirimUangActivity;
import dev.setakarim.ecoin.R;

public class PembayaranActivity extends AppCompatActivity {

    private View btn_lanjut, btn_batal;
    private EditText edit_tujuan, edit_jml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pembayaran);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        btn_lanjut = findViewById(R.id.btn_lanjut);
        btn_batal = findViewById(R.id.btn_batal);
        edit_tujuan = findViewById(R.id.edit_tujuan);
        edit_jml = findViewById(R.id.edit_jml);

        textView.setText("PEMBAYARAN");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PembayaranActivity.this, KonfirmasiPembayaranActivity.class);
                intent.putExtra("tujuan", edit_tujuan.getText().toString());
                intent.putExtra("jumlah", edit_jml.getText().toString());
                startActivity(intent);
            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PembayaranActivity.this, KirimUangActivity.class);
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
