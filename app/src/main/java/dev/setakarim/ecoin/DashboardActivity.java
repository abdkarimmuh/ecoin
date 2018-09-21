package dev.setakarim.ecoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import dev.setakarim.ecoin.Menu.BacaDokumenActivity;
import dev.setakarim.ecoin.Menu.BacaQRCodeActivity;
import dev.setakarim.ecoin.Menu.BayarActivity;
import dev.setakarim.ecoin.Menu.KirimUangActivity;
import dev.setakarim.ecoin.Menu.MyIDActivity;
import dev.setakarim.ecoin.Menu.TagihUangActivity;
import dev.setakarim.ecoin.Menu.TambahKontakActivity;

public class DashboardActivity extends AppCompatActivity {

    private CardView cv_kirim_uang, cv_bayar, cv_tagih_uang, cv_baca_kode_qr, cv_baca_dokumen, cv_tambah_kontak, cv_id_saya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cv_kirim_uang = (CardView)findViewById(R.id.cv_kirim_uang);
        cv_bayar = (CardView)findViewById(R.id.cv_bayar);
        cv_tagih_uang = (CardView)findViewById(R.id.cv_tagih_uang);
        cv_baca_kode_qr = (CardView)findViewById(R.id.cv_baca_kode_qr);
        cv_baca_dokumen = (CardView)findViewById(R.id.cv_baca_dokumen);
        cv_tambah_kontak = (CardView)findViewById(R.id.cv_tambah_kontak);
        cv_id_saya = (CardView)findViewById(R.id.cv_id_saya);



        cv_kirim_uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, KirimUangActivity.class);
                startActivity(intent);
            }
        });

        cv_bayar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, BayarActivity.class);
                startActivity(intent);
            }
        });

        cv_tagih_uang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, TagihUangActivity.class);
                startActivity(intent);
            }
        });

        cv_baca_kode_qr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, BacaQRCodeActivity.class);
                startActivity(intent);
            }
        });

        cv_baca_dokumen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, BacaDokumenActivity.class);
                startActivity(intent);
            }
        });

        cv_tambah_kontak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, TambahKontakActivity.class);
                startActivity(intent);
            }
        });

        cv_id_saya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, MyIDActivity.class);
                startActivity(intent);
            }
        });
    }
}
