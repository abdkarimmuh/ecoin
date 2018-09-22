package dev.setakarim.ecoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import dev.setakarim.ecoin.Menu.BacaDokumenActivity;
import dev.setakarim.ecoin.Menu.KirimUangActivity;
import dev.setakarim.ecoin.Menu.MyIDActivity;
import dev.setakarim.ecoin.Menu.TagihUangActivity;
import dev.setakarim.ecoin.Menu.TambahKontakActivity;
import dev.setakarim.ecoin.Loop.QRCodeReaderActivity;

public class DashboardActivity extends AppCompatActivity {

    private CardView cv_kirim_uang, cv_bayar, cv_tagih_uang, cv_baca_kode_qr, cv_baca_dokumen, cv_tambah_kontak, cv_id_saya;
    private RelativeLayout riwayat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        cv_kirim_uang = findViewById(R.id.cv_kirim_uang);
        cv_bayar = findViewById(R.id.cv_bayar);
        cv_tagih_uang = findViewById(R.id.cv_tagih_uang);
        cv_baca_kode_qr = findViewById(R.id.cv_baca_kode_qr);
        cv_baca_dokumen = findViewById(R.id.cv_baca_dokumen);
        cv_tambah_kontak = findViewById(R.id.cv_tambah_kontak);
        cv_id_saya = findViewById(R.id.cv_id_saya);

        riwayat = findViewById(R.id.riwayat);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("DASHBOARD");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);



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
                Intent intent = new Intent(DashboardActivity.this, QRCodeReaderActivity.class);
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
                Intent intent = new Intent(DashboardActivity.this, QRCodeReaderActivity.class);
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


        riwayat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DashboardActivity.this, RiwayatTransaksiActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }
}
