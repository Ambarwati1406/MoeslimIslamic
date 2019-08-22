package com.ambarwat.moeslimislamic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn_produk;
    private Button btn_jadwal;
    private Button btn_kumpulan_doa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_produk = (Button) findViewById(R.id.btn_produk_halal);
        btn_jadwal = (Button) findViewById(R.id.btn_jadwal_sholat);
        btn_kumpulan_doa = (Button) findViewById(R.id.btn_kumpulan_doa_harian);

        btn_produk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ProdukHalal.class);
                startActivity(intent);
            }
        });

        btn_jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, JadwalSholat.class);
                startActivity(intent);
            }
        });

        btn_kumpulan_doa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, KumpulanDoaHarian.class);
                startActivity(intent);
            }
        });
    }
}
