package carsquared.colormatch;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


import static carsquared.colormatch.coins.coinamt;
import static carsquared.colormatch.level.lvl;
import static carsquared.colormatch.levelUnlock.lvlunlk;



public class winroundactivity extends Activity implements View.OnClickListener{

    Intent go = new Intent();

    Button homebutton;
    Button buttonnextround1;
    Button levelselect;
    Button redobut;

    TextView textviewfinalscorenum;
    TextView levelnum;
    TextView textviewcoinnum;

    String finalscore;

    levelUnlock levelUnlock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winroundactivity);

        levelUnlock = new levelUnlock ();

        levelnum = findViewById(R.id.levelnum);
        textviewfinalscorenum = findViewById(R.id.textViewfinalscorenum);
        textviewcoinnum = findViewById(R.id.textviewcoinnum);
        homebutton = findViewById(R.id.homebutton);
        buttonnextround1 = findViewById(R.id.nextlevel);
        levelselect = findViewById(R.id.levelselect);
        redobut = findViewById(R.id.redobut);

        homebutton.setOnClickListener(this);
        buttonnextround1.setOnClickListener(this);
        levelselect.setOnClickListener(this);
        redobut.setOnClickListener(this);
        finalscore = getIntent().getStringExtra("finalscore");
        textviewfinalscorenum.setText(finalscore);
        unlockLevel();


        textviewcoinnum.setText(String.valueOf(coinamt));
        levelnum.setText("Level  " + lvl);
    }
    void unlockLevel() {





        if (lvl > lvlunlk) {

            coinamt = coinamt + 5;


            lvlunlk ++;




        }
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {

            case R.id.homebutton:
                go.setClass(getApplicationContext(), MainActivity.class);
                startActivity(go);
                finish();
                break;

            case R.id.levelselect:
                go.setClass(getApplicationContext(), LevelActivity.class);
                startActivity(go);
                finish();
                break;

            case R.id.redobut:
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
                break;

            case R.id.nextlevel:
                if (lvlunlk == 20) {
                    go.setClass(getApplicationContext(), classicwin.class);
                    startActivity(go);
                    finish();
                    break;
                } else {
                    lvl = lvl + 1;
                    go.setClass(getApplicationContext(), gameplay.class);
                    startActivity(go);
                    finish();
                    break;
                }
        }
    }







}
