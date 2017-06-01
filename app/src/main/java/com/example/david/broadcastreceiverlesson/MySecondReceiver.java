package com.example.david.broadcastreceiverlesson;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by david on 2017-03-21.
 */

public class MySecondReceiver extends BroadcastReceiver {


    private static final String TAG = MySecondReceiver.class.getSimpleName();

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

            setResultCode(47);
            setResultData("Anders");

            bundle.putString("name", "Maria");
            setResultExtras(bundle);

            abortBroadcast();
            //setResult(47, "anders" bundle);
        }


    }


}
