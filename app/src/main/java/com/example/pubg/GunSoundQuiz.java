package com.example.pubg;

import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GunSoundQuiz extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gun_sound_quiz);

        final MediaPlayer start1 = MediaPlayer.create(this, R.raw.akm);
        Button akm = (Button)this.findViewById(R.id.akm1);
        akm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start1.start();
            }
        });
        final MediaPlayer start2 = MediaPlayer.create(this, R.raw.aug);
        Button aug = (Button)this.findViewById(R.id.auga3);
        aug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start2.start();
            }
        });
        final MediaPlayer start3 = MediaPlayer.create(this, R.raw.beryl);
        Button beryl = (Button)this.findViewById(R.id.m762);
        beryl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start3.start();
            }
        });
        final MediaPlayer start4 = MediaPlayer.create(this, R.raw.groza);
        Button groza = (Button)this.findViewById(R.id.groza);
        groza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start4.start();
            }
        });
        final MediaPlayer start5 = MediaPlayer.create(this, R.raw.ma);
        Button m16a4 = (Button)this.findViewById(R.id.m16a4);
        m16a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start5.start();
            }
        });
        final MediaPlayer start6 = MediaPlayer.create(this, R.raw.m);
        Button m = (Button)this.findViewById(R.id.m416);
        m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start6.start();
            }
        });
        final MediaPlayer start7 = MediaPlayer.create(this, R.raw.m4);
        Button m4 = (Button)this.findViewById(R.id.mutant);
        m4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start7.start();
            }
        });
        final MediaPlayer start8 = MediaPlayer.create(this, R.raw.qbz);
        Button qbz = (Button)this.findViewById(R.id.qbz);
        qbz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start8.start();
            }
        });
        final MediaPlayer start9 = MediaPlayer.create(this, R.raw.scar);
        Button scar = (Button)this.findViewById(R.id.scar);
        scar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start9.start();
            }
        });
        final MediaPlayer start11 = MediaPlayer.create(this, R.raw.mini);
        Button mini = (Button)this.findViewById(R.id.mini);
        mini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start11.start();
            }
        });
        final MediaPlayer start12 = MediaPlayer.create(this, R.raw.mk14);
        Button mk14 = (Button)this.findViewById(R.id.mk14);
        mk14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start12.start();
            }
        });
        final MediaPlayer start13 = MediaPlayer.create(this, R.raw.qbu);
        Button qbu = (Button)this.findViewById(R.id.qbu);
        qbu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                start13.start();
            }
        });
        final MediaPlayer sks1 = MediaPlayer.create(this, R.raw.sks);
        Button sks = (Button)this.findViewById(R.id.sks);
        sks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sks1.start();
            }
        });
        final MediaPlayer slr1 = MediaPlayer.create(this, R.raw.slr);
        Button slr = (Button)this.findViewById(R.id.slr);
        slr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slr1.start();
            }
        });
        final MediaPlayer vss1 = MediaPlayer.create(this, R.raw.vss);
        Button vss = (Button)this.findViewById(R.id.vss);
        vss.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vss1.start();
            }
        });
        final MediaPlayer dp281 = MediaPlayer.create(this, R.raw.dp28);
        Button dp28 = (Button)this.findViewById(R.id.dp28);
        dp28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dp281.start();
            }
        });
        final MediaPlayer m2491 = MediaPlayer.create(this, R.raw.m249);
        Button m249 = (Button)this.findViewById(R.id.m249);
        m249.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m2491.start();
            }
        });
        final MediaPlayer kar98k1 = MediaPlayer.create(this, R.raw.kar98k);
        Button kar98k = (Button)this.findViewById(R.id.kar98k);
        kar98k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                kar98k1.start();
            }
        });
        final MediaPlayer m241 = MediaPlayer.create(this, R.raw.m24);
        Button m24 = (Button)this.findViewById(R.id.m24);
        m24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                m241.start();
            }
        });
        final MediaPlayer awm1 = MediaPlayer.create(this, R.raw.awm);
        Button awm = (Button)this.findViewById(R.id.awm);
        awm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                awm1.start();
            }
        });



    }

}
