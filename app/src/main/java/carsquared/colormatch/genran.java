package carsquared.colormatch;

import android.app.Activity;
import android.widget.Button;


/**
 * Created by Clinton on 7/14/2017.
 */



public class genran extends Activity {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button topcolor;


    public void _genran(double _number) {

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        topcolor = findViewById(R.id.topcolor);


        if ((_number > 0) && (_number < 49)) {

            if (_number < 13) {

                topcolor.setText(R.string.blue);
                topcolor.setTextColor(0xff0f32f4);
                topcolor.setBackgroundResource(R.mipmap.topcolorblue);


                if (_number == 1) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 2) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 3) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.red);
                    button2.setText(R.string.blue);
                    button3.setText(R.string.green);
                    button4.setText(R.string.yellow);
                }

                if (_number == 4) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 5) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 6) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 7) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 8) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 9) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 10) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 11) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 12) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }
            }


            if ((_number > 12) && (_number < 25)) {

                topcolor.setBackgroundResource(R.mipmap.topcolorgreen);
                topcolor.setText(R.string.green);
                topcolor.setTextColor(0xff669900);//green

                if (_number == 13) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 14) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 15) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.red);
                    button2.setText(R.string.blue);
                    button3.setText(R.string.green);
                    button4.setText(R.string.yellow);
                }

                if (_number == 16) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 17) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 18) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 19) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 20) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 21) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 22) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 23) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 24) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }
            }


            if ((_number > 24) && (_number < 37)) {

                topcolor.setBackgroundResource(R.mipmap.topcoloryellow);
                topcolor.setText(R.string.yellow);
                topcolor.setTextColor(0xfff8f824);//yellow

                if (_number == 25) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 26) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 27) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.red);
                    button2.setText(R.string.blue);
                    button3.setText(R.string.green);
                    button4.setText(R.string.yellow);
                }

                if (_number == 28) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 29) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 30) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 31) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 32) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 33) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 34) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 35) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 36) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }
            }


            if ((_number > 36) && (_number < 49)) {

                topcolor.setBackgroundResource(R.mipmap.topcolorred);
                topcolor.setText(R.string.red);
                topcolor.setTextColor(0xffcc0000);//red

                if (_number == 37) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 38) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 39) {

                    button1.setBackgroundColor(0xff0f32f4);//blue
                    button2.setBackgroundColor(0xff669900);//green
                    button3.setBackgroundColor(0xfff8f824);//yellow
                    button4.setBackgroundColor(0xffcc0000);//red
                    button1.setText(R.string.red);
                    button2.setText(R.string.blue);
                    button3.setText(R.string.green);
                    button4.setText(R.string.yellow);
                }

                if (_number == 40) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 41) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 42) {

                    button1.setBackgroundColor(0xff669900);//green
                    button2.setBackgroundColor(0xfff8f824);//yellow
                    button3.setBackgroundColor(0xffcc0000);//red
                    button4.setBackgroundColor(0xff0f32f4);//blue
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 43) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.red);
                    button2.setText(R.string.green);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.yellow);
                }

                if (_number == 44) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }

                if (_number == 45) {

                    button1.setBackgroundColor(0xfff8f824);//yellow
                    button2.setBackgroundColor(0xffcc0000);//red
                    button3.setBackgroundColor(0xff0f32f4);//blue
                    button4.setBackgroundColor(0xff669900);//green
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 46) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.green);
                    button2.setText(R.string.yellow);
                    button3.setText(R.string.red);
                    button4.setText(R.string.blue);
                }

                if (_number == 47) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.yellow);
                    button2.setText(R.string.red);
                    button3.setText(R.string.blue);
                    button4.setText(R.string.green);
                }

                if (_number == 48) {

                    button1.setBackgroundColor(0xffcc0000);//red
                    button2.setBackgroundColor(0xff0f32f4);//blue
                    button3.setBackgroundColor(0xff669900);//green
                    button4.setBackgroundColor(0xfff8f824);//yellow
                    button1.setText(R.string.blue);
                    button2.setText(R.string.green);
                    button3.setText(R.string.yellow);
                    button4.setText(R.string.red);
                }
            }

        }
    }
}
