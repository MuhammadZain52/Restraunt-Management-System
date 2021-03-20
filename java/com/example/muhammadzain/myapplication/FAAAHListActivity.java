package com.example.muhammadzain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class FAAAHListActivity extends AppCompatActivity {

    CardView manager, chef;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_faaah);


        manager = findViewById(R.id.manager_id);
        chef = findViewById(R.id.chef_id);

        chef.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAAAHListActivity.this, FAAAHChefActivity.class);
                startActivity(intent);
            }
        });
        manager.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAAAHListActivity.this, FAAAHHomeActivity.class);
                startActivity(intent);
            }
        });
    }
}
