package com.example.pubg;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AdvanceTips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_advance_tips);

        Button sr = (Button) findViewById(R.id.sr);
        sr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSR();
            }
        });

        Button smalljumps = (Button) findViewById(R.id.smalljumps);
        smalljumps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSmallJumps();
            }
        });

        Button prone = (Button) findViewById(R.id.prone);
        prone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProne();
            }
        });

        Button grenade = (Button) findViewById(R.id.grenade);
        grenade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGrenade();
            }
        });

        Button close = (Button) findViewById(R.id.close);
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openClose();
            }
        });

        Button smokes = (Button) findViewById(R.id.smokes);
        smokes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSmokes();
            }
        });

        Button flanks = (Button) findViewById(R.id.flanks);
        flanks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openFlanks();
            }
        });

        Button gatekeeping = (Button) findViewById(R.id.gatekeeping);
        gatekeeping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openGatekeeping();
            }
        });
    }

    public void openSR() {
        Intent intent = new Intent(this, SniperRifleQuickSwap.class);
        startActivity(intent);
    }

    public void openSmallJumps() {
        Intent intent = new Intent(this, SmallJumps.class);
        startActivity(intent);
    }

    public void openProne() {
        Intent intent = new Intent(this, FallingProne.class);
        startActivity(intent);
    }

    public void openGrenade() {
        Intent intent = new Intent(this, UsingNades.class);
        startActivity(intent);
    }

    public void openClose() {
        Intent intent = new Intent(this, CloseEncounters.class);
        startActivity(intent);
    }

    public void openSmokes() {
        Intent intent = new Intent(this, UsingSmokes.class);
        startActivity(intent);
    }

    public void openFlanks() {
        Intent intent = new Intent(this, Flanks.class);
        startActivity(intent);
    }

    public void openGatekeeping() {
        Intent intent = new Intent(this, Gatekeeping.class);
        startActivity(intent);
    }
}
