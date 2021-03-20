package com.example.muhammadzain.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Login extends AppCompatActivity {
    Button Btn;
    EditText E, F;
    String Username, Password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Btn=findViewById(R.id.Login);
        Btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                E=findViewById(R.id.UserName);
                Username=E.getText().toString();
                F=findViewById(R.id.Password);
                Password=F.getText().toString();

                if(Username.equals("admin") && Password.equals("admin")) {
                    Intent i = new Intent(Login.this, Adder.class);
                    startActivity(i);
                }




                if(Username.equals("inventory") && Password.equals("inventory")){
                    Intent i = new Intent(Login.this, Addinventory.class);
                    startActivity(i);
                }
                if(Username.equals("order") && Password.equals("order")){
                    Intent i = new Intent(Login.this, MUSA_MainActivity.class);
                    startActivity(i);
                }

                if(Username.equals("hall") && Password.equals("hall")){
                    //For Hall Managers
                    Intent i = new Intent(Login.this, FAAMA_MainActivity.class);
                    startActivity(i);
                }

                if(Username.equals("kitchen") && Password.equals("kitchen")){
                    Intent i = new Intent(Login.this, FAAAHMainActivity.class);
                    startActivity(i);                }

                if(Username.equals("owner") && Password.equals("owner")){
                    Intent i = new Intent(Login.this, PentagoneReportPage.class);
                    startActivity(i);
                }


            }
        });
    }
}