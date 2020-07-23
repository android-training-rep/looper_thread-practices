package com.example.looperthreadpractices;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class LooperThread extends Thread {
    public static final String TAG = "LooperThread";
    public Looper looper;
    public Handler handler;

    @Override
    public void  run() {
        looper.prepare();
        looper = looper.myLooper();
        handler = new MyHandler();
        looper.loop();
        Log.d(TAG, "End of Run");
    }
}
