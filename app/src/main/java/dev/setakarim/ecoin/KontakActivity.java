package dev.setakarim.ecoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;

import dev.setakarim.ecoin.Menu.KirimUangActivity;
import dev.setakarim.ecoin.Menu.TambahKontakActivity;

public class KontakActivity extends AppCompatActivity {

    RelativeLayout add_contact, contact_kaori;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);

        add_contact = findViewById(R.id.add_contact);
        contact_kaori = findViewById(R.id.contact_kaori);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("KONTAK");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        add_contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KontakActivity.this, TambahKontakActivity.class);
                startActivity(intent);
            }
        });

        contact_kaori.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(KontakActivity.this, KirimUangActivity.class);
                intent.putExtra("id", "777-777-777");
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
