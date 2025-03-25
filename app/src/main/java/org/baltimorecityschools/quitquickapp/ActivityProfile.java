package org.baltimorecityschools.quitquickapp;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityProfile extends AppCompatActivity {

    ImageView profile;
    Button pBTN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        profile = (ImageView)findViewById(R.id.imageView);
        pBTN = (Button)findViewById(R.id.pButton);

//        pBTN.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                profile.setVisibility(View.VISIBLE);
//                pBTN.setVisibility(View.GONE);
//            }
//        });
    }



}