package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity3 extends AppCompatActivity {
    private Button b1,b2,b3,b4,b5,b6;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        b1 = findViewById(R.id.button);
        b2=findViewById(R.id.button2);
        b3= findViewById(R.id.button3);
        b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);
        b6=findViewById(R.id.button6);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.google.co.in/maps/dir/Chennai,+Tamil+Nadu/Bengaluru,+Karnataka/@12.8305644,78.3614683,9z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3a5265ea4f7d3361:0x6e61a70b6863d433!2m2!1d80.2707184!2d13.0826802!1m5!1m1!1s0x3bae1670c9b44e6d:0xf8dfc3e8517e4fe0!2m2!1d77.5945627!2d12.9715987!3e3?hl=en-GB&authuser=0");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.google.co.in/maps/dir/Vizag,+Andhra+Pradesh/Hyderabad,+Telangana/@17.2335039,79.6829256,8z/data=!3m1!4b1!4m14!4m13!1m5!1m1!1s0x3a39431389e6973f:0x92d9c20395498468!2m2!1d83.2184815!2d17.6868159!1m5!1m1!1s0x3bcb99daeaebd2c7:0xae93b78392bafbc2!2m2!1d78.486671!2d17.385044!3e3?hl=en-GB&authuser=0");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.google.co.in/maps/dir/New+Delhi,+Delhi/Mumbai,+Maharashtra/@12.8305644,78.3614683,9z/data=!4m14!4m13!1m5!1m1!1s0x390cfd5b347eb62d:0x52c2b7494e204dce!2m2!1d77.2090212!2d28.6139391!1m5!1m1!1s0x3be7c6306644edc1:0x5da4ed8f8d648c69!2m2!1d72.8776559!2d19.0759837!3e3?hl=en-GB&authuser=0");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goLink("https://www.google.co.in/maps/dir/Kolkata,+West+Bengal/Varanasi,+Uttar+Pradesh/@22.2663958,73.2231617,6z/data=!4m14!4m13!1m5!1m1!1s0x39f882db4908f667:0x43e330e68f6c2cbc!2m2!1d88.363895!2d22.572646!1m5!1m1!1s0x398e2db76febcf4d:0x68131710853ff0b5!2m2!1d82.9739144!2d25.3176452!3e3?hl=en-GB&authuser=0");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this, SplashScreen.class);
                startActivity(intent);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity3.this, MainActivity4.class);
                startActivity(intent);

            }
        });

    }
    private void goLink(String s){
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));

    }
}