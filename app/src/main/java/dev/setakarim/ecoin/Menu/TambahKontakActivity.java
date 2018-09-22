package dev.setakarim.ecoin.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import dev.setakarim.ecoin.DashboardActivity;
import dev.setakarim.ecoin.Loop.NFCActivity;
import dev.setakarim.ecoin.Loop.QRCodeReaderActivity;
import dev.setakarim.ecoin.R;
import dev.setakarim.ecoin.Loop.SuccessSaveContectActivity;

public class TambahKontakActivity extends AppCompatActivity {

    private EditText edit_nama;
    private View btn_lanjut, btn_batal;
    private ImageView img_qrcode, img_nfc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah_kontak);

        edit_nama = findViewById(R.id.edit_nama);
        btn_lanjut = findViewById(R.id.btn_lanjut);
        btn_batal = findViewById(R.id.btn_batal);
        img_qrcode = findViewById(R.id.img_qrcode);
        img_nfc = findViewById(R.id.img_nfc);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("TAMBAH KONTAK");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TambahKontakActivity.this, SuccessSaveContectActivity.class);
                intent.putExtra("nama", edit_nama.getText().toString());
                startActivity(intent);
            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TambahKontakActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        img_qrcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TambahKontakActivity.this, QRCodeReaderActivity.class);
                startActivity(intent);
            }
        });

        img_nfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TambahKontakActivity.this, NFCActivity.class);
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
