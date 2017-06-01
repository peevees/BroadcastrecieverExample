package com.example.david.broadcastreceiverlesson;

import android.app.Activity;
import android.content.Intent;
import android.os.Debug;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendBroadcastMessage(View view) {

        Intent intent = new Intent("com.example.david.action.actionname");

        Bundle b = new Bundle();
        b.putString("name", "David");

        //sendBroadcast(intent);
        //sendOrderedBroadcast(intent, null);
        sendOrderedBroadcast(intent, null, new MyThirdReceiver(), null, Activity.RESULT_OK, "Laura", b );
    }

}
