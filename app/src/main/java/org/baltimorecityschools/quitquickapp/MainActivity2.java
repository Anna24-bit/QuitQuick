package org.baltimorecityschools.quitquickapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main2);

        button = findViewById(R.id.click);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    NotificationCompat.Builder mbuilder = (NotificationCompat.Builder)
                            new NotificationCompat.Builder(getApplicationContext())
                                    .setSmallIcon(R.drawable.icon)
                                    .setContentTitle("Notification")
                                    .setContentText("This is a notification for you");
                    NotificationManager notificationManager = (NotificationManager)
                            getSystemService(NOTIFICATION_SERVICE);
                    notificationManager.notify(0, mbuilder.build());
                    Log.d("AAAAA", "notification");
                }
                catch(Exception e){
                    Log.d("AAAAA", e.toString());
                }
            }
        });
    }
}