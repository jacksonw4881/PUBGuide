package com.example.pubg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TheGame extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_game);

        Button first = (Button) findViewById(R.id.first);
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFirst();
            }
        });

        Button second = (Button) findViewById(R.id.second);
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSecond();
            }
        });

        Button third = (Button) findViewById(R.id.third);
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openThird();
            }
        });
    }

    public void openFirst() {
        Intent intent = new Intent(this, EarlyGame.class);
        startActivity(intent);
    }

    public void openSecond() {
        Intent intent = new Intent(this, MidGame.class);
        startActivity(intent);
    }

    public void openThird() {
        Intent intent = new Intent(this, LateGame.class);
        startActivity(intent);
    }
}
