package carsquared.colormatch;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loseactivity extends AppCompatActivity {

    SharedPreferences coinprefs;
    String coinData = "coinData";
    String coinInt = "coinInt";
    public static int coins;

    TextView textViewcorrect;
    TextView textView5;

    private Intent gotoact = new Intent();
    private Intent putlevel = new Intent();

    String maxscore;
    String timeleft;
    String finalscore;

    int timeleftnum;


    TextView textviewcoinnum;

    Button buttontryagainfromwrong;
    Button homebutton;
    Button button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loseactivity);

        textView5 = findViewById(R.id.textView5);

        maxscore = getIntent().getStringExtra("maxscore");
        finalscore = getIntent().getStringExtra("finalscore");
        timeleft = getIntent().getStringExtra("timeleft");

        timeleftnum = Integer.parseInt(timeleft);

        if (timeleftnum <= 0){
            textView5.setText("Out of Time!");
        } else {
            textView5.setText("Wrong!");
        }


        coinprefs = getSharedPreferences(coinData, MODE_PRIVATE);
        coins = coinprefs.getInt(coinInt, coins);

        textviewcoinnum = findViewById(R.id.textviewcoinnum);
        textviewcoinnum.setText(String.valueOf(coins));

        textViewcorrect = findViewById(R.id.textViewcorrect);
        textViewcorrect.setText(finalscore + " out of " +(String.valueOf(maxscore)));


        buttontryagainfromwrong = findViewById(R.id.buttontryagainfromwrong);
        homebutton = findViewById(R.id.homebutton);
        button5 = findViewById(R.id.button5);


        buttontryagainfromwrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String level = getIntent().getStringExtra("level");
                putlevel.putExtra("level", level).setClass(getApplicationContext(), gameplay.class);
                startActivity(putlevel);
                finish();
            }
        });
        homebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoact.setClass(getApplicationContext(),MainActivity.class);
                startActivity(gotoact);
                finish();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoact.setClass(getApplicationContext(),LevelActivity.class);
                startActivity(gotoact);
                finish();
            }
        });



    }}