package carsquared.colormatch;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class Opening extends AppCompatActivity  {

    Animation fadeOut;

    Intent go = new Intent();

    private Timer _timer = new Timer();
    private TimerTask timer;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opening);


        //initiates the imageview and animationset//
        ImageView logo = findViewById(R.id.logo);
        AnimationSet fadeout = new AnimationSet(false);

        //loads the animaition//
        fadeOut = AnimationUtils.loadAnimation(this, R.anim.fadeout);


        //adds the animation to the animation set//
        fadeout.addAnimation(fadeOut);


        //starts the animationset//
        logo.startAnimation(fadeout);

        //makes the logo stay gone after fade out or else it comes back//
        logo.setVisibility(View.VISIBLE);

        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        go.setClass(getApplicationContext(),MainActivity.class);
                        startActivity(go);
                        finish();
                    }
                });
            }
        };
        _timer.schedule(timer,1500);

    }
}
