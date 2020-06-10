package com.example.pubg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button advancetips = (Button) findViewById(R.id.advancetips);
        advancetips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAdvanceTips();
            }
        });

        Button quicktips = (Button) findViewById(R.id.quicktips);
        quicktips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openQuickTips();
            }
        });

        Button thegame = (Button) findViewById(R.id.thegame);
        thegame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTheGame();
            }
        });

        Button gunsoundquiz = (Button) findViewById(R.id.pubggunsounds);
        gunsoundquiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGunSoundQuiz();
            }
        });

    }

    public void openAdvanceTips() {
        Intent intent = new Intent(this, AdvanceTips.class);
        startActivity(intent);
    }

    public void openQuickTips() {
        Intent intent = new Intent(this, QuickTips.class);
        startActivity(intent);
    }

    public void openTheGame() {
        Intent intent = new Intent(this, TheGame.class);
        startActivity(intent);
    }

    public void openGunSoundQuiz() {
        Intent intent = new Intent(this, GunSoundQuiz.class);
        startActivity(intent);
    }

}
