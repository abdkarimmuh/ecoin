package dev.setakarim.ecoin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MetodePenagihanActivity extends AppCompatActivity {

    TextView txt_jml;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_metode_penagihan);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        textView.setText("METODE PENAGIHAN");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        txt_jml = findViewById(R.id.txt_jml);

        NumberFormat formatter = new DecimalFormat("#,###");
        Double jumlah = (Double.parseDouble(getIntent().getStringExtra("jumlah")));
        String formattedNumber = formatter.format(jumlah);

        txt_jml.setText("Rp. " + formattedNumber);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
