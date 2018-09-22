package dev.setakarim.ecoin.Pembayaran;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import dev.setakarim.ecoin.R;

public class DoneKonfirmasiPembayaranActivity extends AppCompatActivity {

    private TextView txt_jml, txt_mail;
    private View btn_nota;
    private Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_done_konfirmasi_pembayaran);

        Toolbar toolbar = findViewById(R.id.main_toolbar);
        TextView textView = findViewById(R.id.toolbar_title);

        myDialog = new Dialog(this);

        txt_jml = findViewById(R.id.txt_mail);
        txt_mail = findViewById(R.id.txt_mail);
        btn_nota = findViewById(R.id.btn_nota);

        textView.setText("KONFIRMASI PEMBAYARAN");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

//        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        txt_jml.setText(getIntent().getStringExtra("jumlah"));
        txt_mail.setText(getIntent().getStringExtra("tujuan"));

        btn_nota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ShowPopup(view);
            }
        });
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    public void ShowPopup(View v) {
        ImageView btn_close;
        myDialog.setContentView(R.layout.popup_nota);
        btn_close = myDialog.findViewById(R.id.btn_close);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
}
