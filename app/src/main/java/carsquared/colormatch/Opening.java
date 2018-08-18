package carsquared.colormatch;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.GoogleSignInResult;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

import java.util.Timer;
import java.util.TimerTask;

public class Opening extends AppCompatActivity {

    Animation fadeOut;

    private static final int RC_SIGN_IN = 9001;


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

        logo.setVisibility(View.VISIBLE);

        //makes the logo stay gone after fade out or else it comes back//



        timer = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        startSignInIntent();


                        if (isSignedIn()) {

                    }

                    }
                });
            }
        };
        _timer.schedule(timer, 1500);

    }


    private void signInSilently() {
        GoogleSignInClient signInClient = GoogleSignIn.getClient(this,
                GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
        signInClient.silentSignIn().addOnCompleteListener(this,
                new OnCompleteListener<GoogleSignInAccount>() {
                    @Override
                    public void onComplete(@NonNull Task<GoogleSignInAccount> task) {
                        if (task.isSuccessful()) {
                            // The signed in account is stored in the task's result.
                            GoogleSignInAccount signedInAccount = task.getResult();
                            go.setClass(getApplicationContext(), MainActivity.class);
                            startActivity(go);
                        } else {
                            // Player will need to sign-in explicitly using via UI
                        }
                    }
                });
    }

    @Override
    protected void onResume() {
        super.onResume();
        signInSilently();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == RC_SIGN_IN) {
            GoogleSignInResult result = Auth.GoogleSignInApi.getSignInResultFromIntent(data);
            if (result.isSuccess()) {
                // The signed in account is stored in the result.
                GoogleSignInAccount signedInAccount = result.getSignInAccount();
            } else {
                String message = result.getStatus().getStatusMessage();
                if (message == null || message.isEmpty()) {
                    message = getString(R.string.signin_other_error);
                }
                new AlertDialog.Builder(this).setMessage(message)
                        .setNeutralButton(android.R.string.ok, null).show();
            }
        }
    }
    private boolean isSignedIn () {
        return GoogleSignIn.getLastSignedInAccount(this) != null;
    }

    private void startSignInIntent() {
        GoogleSignInClient signInClient = GoogleSignIn.getClient(this,
                GoogleSignInOptions.DEFAULT_GAMES_SIGN_IN);
        Intent intent = signInClient.getSignInIntent();
        startActivityForResult(intent, RC_SIGN_IN);
    }

}
