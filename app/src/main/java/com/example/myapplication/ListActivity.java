package com.example.myapplication;

import android.os.Bundle;
import android.widget.ArrayAdapter;

import androidx.appcompat.app.AppCompatActivity;

public class ListActivity extends AppCompatActivity {
   private ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        String[] from = { "php_key","c_key","android_key","hacking_key" };

        ArrayAdapter arrayAdapter;

        list = (ListView) findViewById(R.id.list);

        arrayAdapter = new ArrayAdapter<>(this,R.layout.lable, R.id.tvName, from);

        list.setAdapter(arrayAdapter);
    }
}