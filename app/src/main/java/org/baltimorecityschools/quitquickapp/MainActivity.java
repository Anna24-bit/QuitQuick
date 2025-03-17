package org.baltimorecityschools.quitquickapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    Button setButton;
    Intent goToset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        setButton=findViewById(R.id.setbtn);

    }

    setButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            goToset=new Intent(MainActivity.this, SettingsActivity.class);
            startActivity(goToset);
        }
    });

}