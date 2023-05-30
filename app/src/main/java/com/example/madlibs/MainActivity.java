package com.example.madlibs;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnDog;
    private Button btnRain;
    private Button btnBee;
    private Button btnCow;
    private Button btnSheep;
    private Button btnGuitar;
    private Button btnBus;
    private Button btnBike;
    private Button btnTram;
    private Button btnGame;
    private Button btnSiren;
    private Button btnBell;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnDog = findViewById(R.id.btn_dog);
        btnRain = findViewById(R.id.btn_rain);
        btnBee = findViewById(R.id.btn_bee);
        btnCow = findViewById(R.id.btn_cow);
        btnSheep = findViewById(R.id.btn_sheep);
        btnGuitar = findViewById(R.id.btn_guitar);
        btnBus = findViewById(R.id.btn_bus);
        btnBike = findViewById(R.id.btn_bike);
        btnTram = findViewById(R.id.btn_tram);
        btnGame = findViewById(R.id.btn_game);
        btnSiren = findViewById(R.id.btn_siren);
        btnBell = findViewById(R.id.btn_bell);

        btnDog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playDog();
            }
        });

        btnRain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playRain();
            }
        });
        btnBee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playBee();
            }
        });
    }

    private void playDog(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_dog);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playRain(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_rain);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }

    private void playBee(){
        MediaPlayer mp = MediaPlayer.create(this,R.raw.sample_natimals_bumblebee);
        mp.start();
        mp.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mp.stop();
                mp.release();
                mp = null;
            }
        });
    }
}