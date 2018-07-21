package carsquared.colormatch;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.HashMap;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class gameplay extends genran implements View.OnClickListener {

    Intent go = new Intent();

    public level level;



    Button button1;
    Button button2;
    Button button3;
    Button button4;


    Button topcolor;

    int score = 0;
    int maxscore;


    TextView timenum;
    TextView levelnum;
    TextView textviewscore;
    int timeleft;


    Timer _timer = new Timer();
    TimerTask timer;




    SharedPreferences soundPrefs;
    SharedPreferences.Editor soundEditor;
    String soundData = "soundData";
    String soundInt = "soundint";
    public static int sound;






    TimerTask gametimer;


    SoundPool soundPool;
    HashMap<Integer, Integer> soundPoolMap;
    int bing = 1;
    int buzz = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gameplay);
        initialize();
        initializeLogic();

        level = new level();




    }



    void initialize() {

        timenum = findViewById(R.id.timenum);
        levelnum = findViewById(R.id.levelnum);
        textviewscore = findViewById(R.id.textviewscore);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        topcolor = findViewById(R.id.topcolor);


        soundPool = new SoundPool(4, AudioManager.STREAM_MUSIC, 100);
        soundPoolMap = new HashMap<>();
        soundPoolMap.put(bing, soundPool.load(this, R.raw.bing, 1));
        soundPoolMap.put(buzz, soundPool.load(this, R.raw.wrongnoise, 1));
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);

    }


    void isRight() {

        soundPrefs = getSharedPreferences(soundData, MODE_PRIVATE);
        sound = soundPrefs.getInt(soundInt, sound);

        score++;
        textviewscore.setText(String.valueOf(score));


        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        final float curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        final float maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final float leftVolume = curVolume / maxVolume;
        final float rightVolume = curVolume / maxVolume;
        final int priority = 1;
        final int no_loop = 0;
        final float normal_playback_rate = 1f;


        if (sound == 1) {
            soundPool.play(bing, leftVolume, rightVolume,
                    priority, no_loop, normal_playback_rate);
        }


        if (score == maxscore) {
            gametimer.cancel();

            if (lvl < 20) {

                go.putExtra("finalscore", String.valueOf(maxscore));
                go.setClass(getApplicationContext(), winroundactivity.class);
                startActivity(go);
                finish();
            }
            else {
                go.setClass(getApplicationContext(),classicwin.class);
                startActivity(go);
                finish();
            }


        } else {
            _genran(getRandom(1, 48));
        }}




    void isWrong() {

        AudioManager audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        final float curVolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        final float maxVolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        final float leftVolume = curVolume / maxVolume;
        final float rightVolume = curVolume / maxVolume;
        final int priority = 1;
        final int no_loop = 0;
        final float normal_playback_rate = 1f;

        soundPrefs = getSharedPreferences(soundData, MODE_PRIVATE);
        sound = soundPrefs.getInt(soundInt, sound);


        if (sound == 1) {
            soundPool.play(buzz, leftVolume, rightVolume, priority, no_loop, normal_playback_rate);
        }

        gametimer.cancel();
        go.putExtra("finalscore",String.valueOf(score));
        go.putExtra("maxscore",String.valueOf(maxscore));
        go.putExtra("timeleft", String.valueOf(timeleft));
        go.setClass(getApplicationContext(), loseactivity.class);
        startActivity(go);
        finish();

    }

    void initializeLogic() {




        button1.setEnabled(false);
        button2.setEnabled(false);
        button3.setEnabled(false);
        button4.setEnabled(false);
        topcolor.setBackgroundColor(0xFFFFFFFF);
        button1.setText("??? ");
        button1.setBackgroundColor(0xFFFFFFFF);
        button2.setText("??? ");
        button2.setBackgroundColor(0xFFFFFFFF);
        button3.setText("??? ");
        button3.setBackgroundColor(0xFFFFFFFF);
        button4.setText("??? ");
        button4.setBackgroundColor(0xFFFFFFFF);

        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {



                        if (lvl == 1) {
                            maxscore = 1;
                            timeleft = 13;
                        }
                        if (lvl == 2) {
                            maxscore = 1;
                            timeleft = 15;
                        }
                        if (lvl == 3) {
                            maxscore = 1;
                            timeleft = 17;
                        }
                        if (lvl == 4) {
                            maxscore = 1;
                            timeleft = 20;
                        }
                        if (lvl == 5) {
                            maxscore = 1;
                            timeleft = 13;
                        }
                        if (lvl == 6) {
                            maxscore = 1;
                            timeleft = 14;
                        }
                        if (lvl == 7) {
                            maxscore = 1;
                            timeleft = 15;
                        }
                        if (lvl == 8) {
                            maxscore = 1;
                            timeleft = 16;
                        }
                        if (lvl == 9) {
                            maxscore = 1;
                            timeleft = 17;
                        }
                        if (lvl == 10) {
                            maxscore = 1;
                            timeleft = 18;
                        }
                        if (lvl == 11) {
                            maxscore = 17;
                            timeleft = 19;
                        }
                        if (lvl == 12) {
                            maxscore = 18;
                            timeleft = 20;
                        }
                        if (lvl == 13) {
                            maxscore = 19;
                            timeleft = 21;
                        }
                        if (lvl == 14) {
                            maxscore = 20;
                            timeleft = 22;
                        }
                        if (lvl == 15) {
                            maxscore = 21;
                            timeleft = 22;
                        }
                        if (lvl == 16) {
                            maxscore = 22;
                            timeleft = 23;
                        }
                        if (lvl == 17) {
                            maxscore = 23;
                            timeleft = 24;
                        }
                        if (lvl == 18) {
                            maxscore = 24;
                            timeleft = 24;
                        }
                        if (lvl == 19) {
                            maxscore = 25;
                            timeleft = 25;
                        }
                        if (lvl == 20) {
                            maxscore = 26;
                            timeleft = 25;
                        }

                        runTimer();



                        _timer.scheduleAtFixedRate(gametimer, (0), (1000));


                        _genran(getRandom(1, 48));
                        button1.setEnabled(true);
                        button2.setEnabled(true);
                        button3.setEnabled(true);
                        button4.setEnabled(true);
                    }
                });
            }
        };

        _timer.schedule(timer, 1000);
    }




    @Override
    public void onClick(View v) {


        switch (v.getId()) {
            case R.id.button1:
                if (button1.getText().toString().equals(topcolor.getText().toString())) {
                    isRight();
                } else {
                    isWrong();
                }
                break;

            case R.id.button2:
                if (button2.getText().toString().equals(topcolor.getText().toString())) {
                    isRight();
                } else {
                    isWrong();
                }
                break;

            case R.id.button3:
                if (button3.getText().toString().equals(topcolor.getText().toString())) {
                    isRight();
                } else {
                    isWrong();
                }
                break;

            case R.id.button4:
                if (button4.getText().toString().equals(topcolor.getText().toString())) {
                    isRight();
                } else {
                    isWrong();
                }
                break;
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if (sound == 1) {
            soundPool.release();
        }
    }

    void runTimer() {

        gametimer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {


                        levelnum.setText("Level: " + lvl);
                        timenum.setText("Time: " + timeleft);
                        timeleft--;
                        timer.cancel();
                        if (timeleft == -1) {
                            gametimer.cancel();
                            go.putExtra("finalscore",String.valueOf(score));
                            go.putExtra("maxscore",String.valueOf(maxscore));
                            go.putExtra("timeleft", String.valueOf(timeleft));
                            go.setClass(getApplicationContext(), loseactivity.class);
                            startActivity(go);
                            finish();
                        }
                    }
                });
            }
        };


    }



    private int getRandom(int _minValue, int _maxValue) {
        Random random = new Random();
        return random.nextInt(_maxValue - _minValue + 1) + _minValue;
    }
}

