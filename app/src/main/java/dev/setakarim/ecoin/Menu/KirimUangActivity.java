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
import dev.setakarim.ecoin.KontakActivity;
import dev.setakarim.ecoin.PembayaranActivity;
import dev.setakarim.ecoin.R;

public class KirimUangActivity extends AppCompatActivity {

    private View btn_lanjut, btn_batal;
    private ImageView img_contact;
    private EditText edit_id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kirim_uang);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        btn_lanjut = findViewById(R.id.btn_lanjut);
        btn_batal = findViewById(R.id.btn_batal);
        img_contact = findViewById(R.id.img_contact);
        edit_id = findViewById(R.id.edit_id);

        textView.setText("KIRIM");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        edit_id.setText(getIntent().getStringExtra("id"));

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KirimUangActivity.this, PembayaranActivity.class);
                startActivity(intent);
            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KirimUangActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });

        img_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KirimUangActivity.this, KontakActivity.class);
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
