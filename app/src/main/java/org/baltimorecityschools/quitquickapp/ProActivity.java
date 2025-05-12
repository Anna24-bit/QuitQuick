package org.baltimorecityschools.quitquickapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;


public class ProActivity extends AppCompatActivity {
    ProgressBar prg;
    Button btnB, btnA, btnG;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pro);

        prg=(ProgressBar)findViewById(R.id.progressBar);
        btnB=(Button)findViewById(R.id.buttonbad);
        btnG=(Button)findViewById(R.id.buttongood);
        btnA=(Button)findViewById(R.id.buttonalright);

        btnB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prg.setProgress(10);
            }
        });


        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prg.setProgress(50);
            }
        });

        btnG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prg.setProgress(100);
            }
        });




    }
}