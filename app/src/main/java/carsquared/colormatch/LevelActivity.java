package carsquared.colormatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import static carsquared.colormatch.levelUnlock.lvlunlk;

public class LevelActivity extends AppCompatActivity {

    Intent go = new Intent();


    public level level;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level);
        level = new level();






        TextView modetext = findViewById(R.id.modetext);
        modetext.setText(R.string.ClassicMode);


        ImageButton backbut = findViewById(R.id.backbut);
        Button butlvl1 = findViewById(R.id.butlvl1);
        Button butlvl2 = findViewById(R.id.butlvl2);
        Button butlvl3 = findViewById(R.id.butlvl3);
        Button butlvl4 = findViewById(R.id.butlvl4);
        Button butlvl5 = findViewById(R.id.butlvl5);
        Button butlvl6 = findViewById(R.id.butlvl6);
        Button butlvl7 = findViewById(R.id.butlvl7);
        Button butlvl8 = findViewById(R.id.butlvl8);
        Button butlvl9 = findViewById(R.id.butlvl9);
        Button butlvl10 = findViewById(R.id.butlvl10);
        Button butlvl11 = findViewById(R.id.butlvl11);
        Button butlvl12 = findViewById(R.id.butlvl12);
        Button butlvl13 = findViewById(R.id.butlvl13);
        Button butlvl14 = findViewById(R.id.butlvl14);
        Button butlvl15 = findViewById(R.id.butlvl15);
        Button butlvl16 = findViewById(R.id.butlvl16);
        Button butlvl17 = findViewById(R.id.butlvl17);
        Button butlvl18 = findViewById(R.id.butlvl18);
        Button butlvl19 = findViewById(R.id.butlvl19);
        Button butlvl20 = findViewById(R.id.butlvl20);

        butlvl1.setEnabled(true);
        butlvl2.setEnabled(false);
        butlvl3.setEnabled(false);
        butlvl4.setEnabled(false);
        butlvl5.setEnabled(false);
        butlvl6.setEnabled(false);
        butlvl7.setEnabled(false);
        butlvl8.setEnabled(false);
        butlvl9.setEnabled(false);
        butlvl10.setEnabled(false);
        butlvl11.setEnabled(false);
        butlvl12.setEnabled(false);
        butlvl13.setEnabled(false);
        butlvl14.setEnabled(false);
        butlvl15.setEnabled(false);
        butlvl16.setEnabled(false);
        butlvl17.setEnabled(false);
        butlvl18.setEnabled(false);
        butlvl19.setEnabled(false);
        butlvl20.setEnabled(false);

        butlvl2.setBackgroundResource(R.mipmap.lock);
        butlvl3.setBackgroundResource(R.mipmap.lock);
        butlvl4.setBackgroundResource(R.mipmap.lock);
        butlvl5.setBackgroundResource(R.mipmap.lock);
        butlvl6.setBackgroundResource(R.mipmap.lock);
        butlvl7.setBackgroundResource(R.mipmap.lock);
        butlvl8.setBackgroundResource(R.mipmap.lock);
        butlvl9.setBackgroundResource(R.mipmap.lock);
        butlvl10.setBackgroundResource(R.mipmap.lock);
        butlvl11.setBackgroundResource(R.mipmap.lock);
        butlvl12.setBackgroundResource(R.mipmap.lock);
        butlvl13.setBackgroundResource(R.mipmap.lock);
        butlvl14.setBackgroundResource(R.mipmap.lock);
        butlvl15.setBackgroundResource(R.mipmap.lock);
        butlvl16.setBackgroundResource(R.mipmap.lock);
        butlvl17.setBackgroundResource(R.mipmap.lock);
        butlvl18.setBackgroundResource(R.mipmap.lock);
        butlvl19.setBackgroundResource(R.mipmap.lock);
        butlvl20.setBackgroundResource(R.mipmap.lock);

        butlvl2.setText("");
        butlvl3.setText("");
        butlvl4.setText("");
        butlvl5.setText("");
        butlvl6.setText("");
        butlvl7.setText("");
        butlvl8.setText("");
        butlvl9.setText("");
        butlvl10.setText("");
        butlvl11.setText("");
        butlvl12.setText("");
        butlvl13.setText("");
        butlvl14.setText("");
        butlvl15.setText("");
        butlvl16.setText("");
        butlvl17.setText("");
        butlvl18.setText("");
        butlvl19.setText("");
        butlvl20.setText("");





        if (lvlunlk >= 1) {
            butlvl2.setEnabled(true);
            butlvl2.setBackgroundResource(R.mipmap.topcolorgreen);
            butlvl2.setText(R.string.two);
        }
        if (lvlunlk >= 2) {
            butlvl3.setEnabled(true);
            butlvl3.setBackgroundResource(R.mipmap.topcoloryellow);
            butlvl3.setText(R.string.three);

        }
        if (lvlunlk >= 3) {
            butlvl4.setEnabled(true);
            butlvl4.setBackgroundResource(R.mipmap.topcolorred);
            butlvl4.setText(R.string.four);


        }
        if (lvlunlk >= 4) {
            butlvl5.setEnabled(true);
            butlvl5.setBackgroundResource(R.mipmap.topcolorgreen);
            butlvl5.setText(R.string.five);

        }
        if (lvlunlk >= 5) {
            butlvl6.setEnabled(true);
            butlvl6.setBackgroundResource(R.mipmap.topcoloryellow);
            butlvl6.setText(R.string.six);

        }
        if (lvlunlk >= 6) {
            butlvl7.setEnabled(true);
            butlvl7.setBackgroundResource(R.mipmap.topcolorred);
            butlvl7.setText(R.string.seven);

        }
        if (lvlunlk >= 7) {
            butlvl8.setEnabled(true);
            butlvl8.setBackgroundResource(R.mipmap.topcolorblue);
            butlvl8.setText(R.string.eight);

        }
        if (lvlunlk >= 8) {
            butlvl9.setEnabled(true);
            butlvl9.setBackgroundResource(R.mipmap.topcoloryellow);
            butlvl9.setText(R.string.nine);

        }
        if (lvlunlk >= 9) {
            butlvl10.setEnabled(true);
            butlvl10.setBackgroundResource(R.mipmap.topcolorred);
            butlvl10.setText(R.string.ten);

        }
        if (lvlunlk >= 10) {
            butlvl11.setEnabled(true);
            butlvl11.setBackgroundResource(R.mipmap.topcolorblue);
            butlvl11.setText(R.string.eleven);

        }
        if (lvlunlk >= 11) {
            butlvl12.setEnabled(true);
            butlvl12.setBackgroundResource(R.mipmap.topcolorgreen);
            butlvl12.setText(R.string.twelve);

        }
        if (lvlunlk >= 12) {
            butlvl13.setEnabled(true);
            butlvl13.setBackgroundResource(R.mipmap.topcolorred);
            butlvl13.setText(R.string.thirteen);

        }
        if (lvlunlk >= 13) {
            butlvl14.setEnabled(true);
            butlvl14.setBackgroundResource(R.mipmap.topcolorblue);
            butlvl14.setText(R.string.fourteen);

        }
        if (lvlunlk >= 14) {
            butlvl15.setEnabled(true);
            butlvl15.setBackgroundResource(R.mipmap.topcolorgreen);
            butlvl15.setText(R.string.fifteen);

        }
        if (lvlunlk >= 15) {
            butlvl16.setEnabled(true);
            butlvl16.setBackgroundResource(R.mipmap.topcoloryellow);
            butlvl16.setText(R.string.sixteen);

        }
        if (lvlunlk >= 16) {
            butlvl17.setEnabled(true);
            butlvl17.setBackgroundResource(R.mipmap.topcolorblue);
            butlvl17.setText(R.string.seventeen);

        }
        if (lvlunlk >= 17) {
            butlvl18.setEnabled(true);
            butlvl18.setBackgroundResource(R.mipmap.topcolorgreen);
            butlvl18.setText(R.string.eighteen);

        }
        if (lvlunlk >= 18) {
            butlvl19.setEnabled(true);
            butlvl19.setBackgroundResource(R.mipmap.topcoloryellow);
            butlvl19.setText(R.string.nineteen);

        }
        if (lvlunlk >= 19) {
            butlvl20.setEnabled(true);
            butlvl20.setBackgroundResource(R.mipmap.topcolorred);
            butlvl20.setText(R.string.twenty);

        }


        backbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go.setClass(getApplicationContext(), gamemodes.class);
                startActivity(go);
                finish();
            }
        });


        butlvl1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level.setLvl(1);
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level.setLvl(2);
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level.setLvl(3);
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                level.setLvl(4);
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });


        butlvl8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();
            }
        });

        butlvl20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                go.setClass(getApplicationContext(), gameplay.class);
                startActivity(go);
                finish();


            }


        });
    }










}