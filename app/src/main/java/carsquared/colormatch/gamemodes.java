package carsquared.colormatch;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import java.util.logging.Level;

public class gamemodes extends AppCompatActivity implements View.OnClickListener {

    ImageButton backbut;
    Button classicbut;

    Intent go = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gamemodes);

        backbut = findViewById(R.id.backbut);
        classicbut = findViewById(R.id.classicbut);


        backbut.setOnClickListener(this);
        classicbut.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.backbut:
                go.setClass(getApplicationContext(), MainActivity.class);
                startActivity(go);
                finish();
                break;

            case R.id.classicbut:
                go.setClass(getApplicationContext(), LevelActivity.class);
                startActivity(go);
                finish();
                break;

        }
    }
}
