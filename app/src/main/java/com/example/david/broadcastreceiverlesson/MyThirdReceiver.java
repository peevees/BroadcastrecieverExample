package com.example.david.broadcastreceiverlesson;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MyThirdReceiver extends BroadcastReceiver {


    private static final String TAG = MyThirdReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        if (isOrderedBroadcast()) {
            int initCode = getResultCode();
            String initData = getResultData();

            Bundle bundle = getResultExtras(true);
            String name = bundle.getString("name");

            Log.d(TAG, "Code: " + initCode + "Data" + initData + " Bundle" + name);
            Log.d(TAG, "Hello from second Receiver");
            Toast.makeText(context, "Hello from second Receiver", Toast.LENGTH_LONG).show();

        }


    }
}
