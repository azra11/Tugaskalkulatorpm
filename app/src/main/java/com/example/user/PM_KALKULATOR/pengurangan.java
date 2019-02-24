package com.example.user.PM_KALKULATOR;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class pengurangan extends AppCompatActivity {
    private Button btnKurang;
    private EditText X,Y;
    private TextView hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pengurangan);
        btnKurang = findViewById(R.id.btn_kurang);
        X = findViewById(R.id.angka);
        Y = findViewById(R.id.angka2);
        hasil = findViewById(R.id.tv_kurang);

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    double p = Double.parseDouble(X.getText().toString());
                    double l = Double.parseDouble(Y.getText().toString());

                    double min = p - l;

                    hasil.setText(String.valueOf(min));
                }catch(NumberFormatException a) {
                    Toast.makeText(getApplicationContext(), "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
