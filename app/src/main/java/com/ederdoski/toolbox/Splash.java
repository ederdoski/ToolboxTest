package com.ederdoski.toolbox;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.ederdoski.toolbox.utils.Functions;

import java.util.Timer;
import java.util.TimerTask;

import butterknife.ButterKnife;

public class Splash extends AppCompatActivity {

    private void confingureApp(){
        final Timer timer = new Timer();
        final TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(() -> {

                    Functions.closeActivitys(Splash.this, MainActivity.class);

                });
            }
        };
        timer.schedule(task, 3000);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splash);
        ButterKnife.bind(this);

        confingureApp();
    }
}
