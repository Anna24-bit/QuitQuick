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

public class SettingsActivity2 extends AppCompatActivity {
    //initialize the shared preferences
    Button shadBtn;
    Button bluBtn;
    Button rosBtn;
    LinearLayout Bground;
    Intent welcomeToset;
    Button setButton;
    Intent goToset;


    private SharedPreferences mPreferences;
    private String sharedPrefFile = "org.baltimorecityschools.bookquizappal";
    private final String Name_KEY= "Name";
    private final String COLOR_KEY= "color";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_settings2);

        mPreferences=getSharedPreferences(sharedPrefFile, MODE_PRIVATE);
        setButton =(Button) findViewById(R.id.setbtn);
        shadBtn= (Button) findViewById(R.id.y);
        rosBtn = (Button) findViewById(R.id.v);
        bluBtn = (Button) findViewById(R.id.b);
        Bground = (LinearLayout) findViewById(R.id.bacg);
        int initialColor= mPreferences.getInt(COLOR_KEY, 0);

        setButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToset=new Intent(SettingsActivity2.this, MainActivity.class);
                startActivity(goToset);
            }
        });

        if(initialColor == R.id.y){
            Bground.setBackgroundColor(getColor(R.color.shadow));
            Log.d(null,"shadow");
        }else if ( initialColor == R.id.v){
            Bground.setBackgroundColor((getColor(R.color.rose)));
        }else if ( initialColor == R.id.b){
            Bground.setBackgroundColor(getColor(R.color.blue));
        }



        shadBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bground.setBackgroundColor(getColor(R.color.gray));
                selectColor(view);
            }
        });

        rosBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bground.setBackgroundColor(getColor(R.color.rose));
                selectColor(view);
            }
        });

        bluBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bground.setBackgroundColor(getColor(R.color.blue));
                selectColor(view);
            }
        });


    }

    public void selectColor(View view) {

        SharedPreferences.Editor preferencesEditor = mPreferences.edit();

        preferencesEditor.putInt(COLOR_KEY, view.getId());

        preferencesEditor.apply();

        if(view.getId() == R.id.y){
            Bground.setBackgroundColor(getColor(R.color.shadow));
            Log.d(null,"yellow");
        }else if (view.getId() == R.id.v){
            Bground.setBackgroundColor((getColor(R.color.rose)));
        }else if (view.getId() == R.id.b){
            Bground.setBackgroundColor(getColor(R.color.blue));
        }
    }








}


