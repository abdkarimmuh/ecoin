package dev.setakarim.ecoin.Menu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import dev.setakarim.ecoin.DashboardActivity;
import dev.setakarim.ecoin.MetodePenagihanActivity;
import dev.setakarim.ecoin.R;

public class TagihUangActivity extends AppCompatActivity {

    private View btn_lanjut, btn_batal;
    private EditText edit_jml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagih_uang);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("TAGIHAN");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        btn_lanjut = findViewById(R.id.btn_lanjut);
        btn_batal = findViewById(R.id.btn_batal);
        edit_jml = findViewById(R.id.edit_jml);

        btn_lanjut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TagihUangActivity.this, MetodePenagihanActivity.class);
                intent.putExtra("jumlah", edit_jml.getText().toString());
                startActivity(intent);
            }
        });

        btn_batal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TagihUangActivity.this, DashboardActivity.class);
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
