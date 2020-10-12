package com.chalkag.WICON;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.appcompat.app.AppCompatActivity;

public class SplashScreen extends AppCompatActivity {
    ImageView iv;
    ProgressBar pb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);
        iv = (ImageView)findViewById(R.id.iv);
        pb = (ProgressBar)findViewById(R.id.pb);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        }).start();
    }

    private void doWork(){
        for (int p=0;p<100;p+=10){
            try {
                Thread.sleep(150);
                pb.setProgress(p);
            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();
            }
        }
    }
    private void startApp(){
        Intent i = new Intent(SplashScreen.this, MainActivity.class);
        startActivity(i);
    }
}
