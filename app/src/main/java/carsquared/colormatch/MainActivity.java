package carsquared.colormatch;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.common.SignInButton;
import com.google.android.gms.drive.Drive;
import com.google.android.gms.games.SnapshotsClient;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Intent go = new Intent();
    ImageButton buttoninstructions;
    ImageButton buttonstore;
    ImageButton buttonstart;
    ImageButton optionsButton;
    Button llPlay;
    Button awardsLink;
    Button buttonSignOut;
    SignInButton buttonLogin;
    TextView textviewcoinnum;
    SharedPreferences soundPrefs;
    SharedPreferences.Editor soundEditor;
    String soundData = "soundData";
    String soundInt = "soundint";
    int sound;
    int defaultSoundInt = 1;
    final Context context = this;

    private static final String TAG = "ColorMatch";



    // progress dialog we display while we're loading state from the cloud
    ProgressDialog mLoadingDialog = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttoninstructions = findViewById(R.id.buttoninstructions);

        buttonstore = findViewById(R.id.buttonstore);
        buttonstart = findViewById(R.id.buttonstart);
        optionsButton = findViewById(R.id.optionsButton);
        buttonstart.setOnClickListener(this);
        buttoninstructions.setOnClickListener(this);
        buttonstore.setOnClickListener(this);
        optionsButton.setOnClickListener(this);
        buttonLogin.setOnClickListener(this);
        soundPrefs = getSharedPreferences(soundData, MODE_PRIVATE);
        sound = soundPrefs.getInt(soundInt, defaultSoundInt);
        textviewcoinnum = findViewById(R.id.textviewcoinnum);
       // textviewcoinnum.setText(String.valueOf());
    }

    private void showAchievements() {

    }



    private void signOut () {
        GoogleSignInClient signInClient = GoogleSignIn.getClient(this,
                GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
        signInClient.signOut().addOnCompleteListener(this,
                new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        //user is signed out
                    }
                });


    }





    @Override
    public void onClick(View v) {
        switch (v.getId()) {



            case R.id.buttonstart:
                go.setClass(getApplicationContext(),gamemodes.class);
                startActivity(go);
                finish();
                break;

            case R.id.buttoninstructions:
                go.setClass(getApplicationContext(),instructionsactivity.class);
                startActivity(go);
                finish();
                break;

            case R.id.buttonstore:
                break;


            case R.id.optionsButton:
                go.setClass(getApplicationContext(),options_dialog_Activity.class);
                startActivity(go);

                sound = soundPrefs.getInt(soundInt, defaultSoundInt);
                soundEditor = soundPrefs.edit();
                final Dialog dia = new Dialog(context);
                dia.setContentView(R.layout.options_dialog);
                dia.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dia.setCanceledOnTouchOutside(false);
                dia.show();

               ImageButton closebut = dia.findViewById(R.id.closebut);
               final ToggleButton soundbut = dia.findViewById(R.id.soundbut);
               Button creditbut = dia.findViewById(R.id.creditbut);
               awardsLink = dia.findViewById(R.id.awardsLink);

               awardsLink.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                showAchievements();

                }
                });


                llPlay = dia.findViewById(R.id.llPlay);

                llPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
               // showLeaderboard();

                }
                });



                closebut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                dia.dismiss();
                }
                });

                creditbut.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                go.setClass(getApplicationContext(),creditsactivity.class);
                startActivity(go);

                }
                });

                if (sound == 1){
                soundbut.setChecked(true);
                } else if (sound == 0){
                soundbut.setChecked(false);
                }
                if (soundbut.isChecked()){
                soundEditor.putInt(soundInt, 1).apply();
                }

                soundbut.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                if (isChecked){
                soundEditor.putInt(soundInt, 1).apply();
                } else {
                soundEditor.putInt(soundInt, 0).apply();
                }

                }
                });
                break;

        }
    }







    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume()");

        // Since the state of the signed in user can change when the activity is not active
        // it is recommended to try and sign in silently from when the app resumes.
       // signInSilently();
    }


}