package com.example.muhammadzain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.squareup.picasso.Picasso;

public class FAAAHMainActivity extends AppCompatActivity {


    ImageView imglogo;
    Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_faaah);

        imglogo = findViewById(R.id.login_img);
        Picasso.get().load(R.drawable.kitchen_logo).into(imglogo);
        button = findViewById(R.id.login_btn);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FAAAHMainActivity.this, FAAAHListActivity.class);
                startActivity(intent);
            }
        });

    }
}
