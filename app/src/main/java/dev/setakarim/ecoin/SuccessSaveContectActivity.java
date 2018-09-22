package dev.setakarim.ecoin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.TextView;

public class SuccessSaveContectActivity extends AppCompatActivity {

    TextView txt_mail;
    CardView cv_success;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_success_save_contect);

        txt_mail = findViewById(R.id.txt_mail);
        cv_success = findViewById(R.id.cv_success);

        txt_mail.setText(getIntent().getStringExtra("nama"));

        cv_success.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SuccessSaveContectActivity.this, DashboardActivity.class);
                startActivity(intent);
            }
        });
    }
}
