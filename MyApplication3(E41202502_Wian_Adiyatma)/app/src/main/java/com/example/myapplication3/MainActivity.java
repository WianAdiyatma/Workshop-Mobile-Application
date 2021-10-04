package com.example.ListSederhana;
//Wian Adiyatma Bisma Razaak
//E41202502
//GOL D

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.myapplication3.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listview);

        String[] namaHewan = {"Singa", "Harimau", "Gajah", "Jerapah", "Kucing" , "Kelinci" , "Ayam" , "Rusa" , "Sapi" , "Badak" , "Bebek" , "Kangguru"};
        //memberikan nama hewan pada list view

        ArrayAdapter<String> myAdapter = new ArrayAdapter {this, android.R.layout.simple_list_item_1, namaHewan );
    //memanggil string nama hewan untuk ditampilkan di list view

        list.setAdapter(myAdapter);
        //memanggil list view (my adapter)
    }
    }
}