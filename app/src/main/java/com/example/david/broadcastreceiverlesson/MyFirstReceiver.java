package com.example.david.broadcastreceiverlesson;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by david on 2017-03-21.
 */

public class MyFirstReceiver extends BroadcastReceiver {

    private static final String TAG = MyFirstReceiver.class.getSimpleName();

    @Override
    public void onReceive(Context context, Intent intent) {

        if (isOrderedBroadcast()) {
            int initCode = getResultCode();
            String initData = getResultData();

            Bundle bundle = getResultExtras(true);
            String name = bundle.getString("name");

            Log.d(TAG, "Code: " + initCode + "Data" + initData + " Bundle" + name);
            Log.d(TAG, "Hello from first Receiver");
            Toast.makeText(context, "Hello from first Receiver", Toast.LENGTH_LONG).show();

            setResultCode(83);
            setResultData("Lois");

            bundle.putString("name", "Susan");
            setResultExtras(bundle);
        }
    }
}
