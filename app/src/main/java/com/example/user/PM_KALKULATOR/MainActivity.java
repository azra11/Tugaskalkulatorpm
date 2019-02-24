package com.example.user.PM_KALKULATOR;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.project_kalkulator.R;

public class MainActivity extends AppCompatActivity {
    private Button tambah, kurang, bagi, kali, pangkat2, pangkat3, persen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambah = findViewById(R.id.btn_jumlah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), penjumlahan.class);
                startActivity(intent);
            }
        });
        kurang = findViewById(R.id.btn_kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pengurangan.class);
                startActivity(intent);
            }
        });
        bagi = findViewById(R.id.btn_bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), pembagian.class);
                startActivity(intent);
            }
        });
        kali = findViewById(R.id.btn_kali);
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), perkalian.class);
                startActivity(intent);
            }
        });


        persen = findViewById(R.id.btn_persen);
        persen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), persen.class);
                startActivity(intent);
            }
        });
    }

}
