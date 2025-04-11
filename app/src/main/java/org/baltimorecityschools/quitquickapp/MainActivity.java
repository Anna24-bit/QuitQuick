package org.baltimorecityschools.quitquickapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;



public class MainActivity extends AppCompatActivity {
    Button setButton;
    Button proButton;
    Button barBtn;
    Intent goToset;
    Intent goTopro;
    Intent goTobar;
    Button navButton;
    Intent goTonav;
    private SharedPreferences mPreferences;
    private String sharedPrefFile = "org.baltimorecityschools.bookquizappal";
    private final String Name_KEY= "Name";
    private final String COLOR_KEY= "color";;
    LinearLayout Bground2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        setButton=findViewById(R.id.setbtn);
        proButton=findViewById(R.id.ProId);
        barBtn=findViewById(R.id.trackp);
        navButton=findViewById(R.id.navbtn);
        Bground2= (LinearLayout) findViewById(R.id.bacg2);
        mPreferences=getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
        int initialColor= mPreferences.getInt(COLOR_KEY, 0);


//copied

        if(initialColor == R.id.y){
            Bground2.setBackgroundColor(getColor(R.color.shadow));
            Log.d(null,"shadow");
        }else if ( initialColor == R.id.v){
            Bground2.setBackgroundColor((getColor(R.color.rose)));
        }else if ( initialColor == R.id.b){
            Bground2.setBackgroundColor(getColor(R.color.blue));
        }




        //Buttons

      //  settings btn
        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToset=new Intent(MainActivity.this, SettingsActivity2.class);
                startActivity(goToset);
            }
        });

        //profile btn
        proButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTopro=new Intent(MainActivity.this, ActivityProfile.class);
                startActivity(goTopro);
            }
        });

        barBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTobar=new Intent(MainActivity.this, ProActivity.class);
                startActivity(goTobar);
            }
        });



        navButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goTonav=new Intent(MainActivity.this, MenuActivity.class);
                startActivity(goTonav);
            }
        });

    }




}