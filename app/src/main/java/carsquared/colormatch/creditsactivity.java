package carsquared.colormatch;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class creditsactivity extends AppCompatActivity {

    Button backbutton;

    Intent go = new Intent();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creditsactivity);

        backbutton = findViewById(R.id.backbutton);


        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                go.setClass(getApplicationContext(), MainActivity.class);
                startActivity(go);
                finish();
            }
        });

    }
}
