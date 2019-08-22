package com.ambarwat.moeslimislamic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class KumpulanDoaHarian extends AppCompatActivity {

    // Data-data yang Akan dimasukan pada ListView
    private String[] doa = {"Doa Niat Wudhu", "Doa Setelah Wudhu", "Doa Akan Membaca Al-Qur'an", "Doa Setelah Membaca Al-Qur'an", "Doa Masuk Masjid", "Doa Keluar Masjid", "Doa Memohon Ilmu Yang Bermanfaat", "Doa Masuk Rumah", "Doa Keluar Rumah", "Doa Masuk Kamar Mandi", "Doa Keluar Kamar Mandi", "Doa Sebelum Tidur", "Doa Bangun Tidur"};

    // ArrayList digunakan untuk menampung Data Doa
    private ArrayList<String> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_doa_harian);

        ListView listView = findViewById(R.id.listitem);
        data = new ArrayList<>();
        getData();

        // ArrayAdapter digunakan untuk mengatur, bagian item pada ListView akan tampil
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.support_simple_spinner_dropdown_item, data);
        listView.setAdapter(adapter);

        // Menambahkan Listener, untuk menangani kejadian saat salah satu item listview di klik
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // Mendapatkan Nama pada salah satu item yang diklik, berdasarkan posisinya
                String getName = data.get(position);

                // Berpindah Activity dan Mempassing data Nama pada Activity Selanjutnya
                Intent sendData = new Intent(KumpulanDoaHarian.this, DataDoa.class);
                sendData.putExtra("MyName", getName);
                startActivity(sendData);
            }
        });
    }

    private void getData() {
        // Memasukan Semua Data Doa kedalam ArrayList
        Collections.addAll(data, doa);
    }
}
