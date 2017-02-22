package com.bwie.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



import android.view.KeyEvent;
import android.widget.Toast;



import java.util.Timer;


import java.util.TimerTask;

public
class
MainActivity extends AppCompatActivity {

    private long waitTime = 2000;
    private long touchTime = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode==KeyEvent.KEYCODE_BACK) {

            exitBy();
        }
        return false;
        }
    private static Boolean isExit=false;
    private void exitBy() {

        Timer tExit=null;
        if(isExit==false){

            isExit=true;
            Toast.makeText(this,"双击退出",Toast.LENGTH_SHORT).show();
            tExit=new Timer();
            tExit.schedule(new TimerTask() {


                @Override
                public void run() {
                    isExit=false;
                }
            },2000);
        }else {
            finish();
            System.exit(0);
        }

    }
}

