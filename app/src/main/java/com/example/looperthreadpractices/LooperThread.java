package com.example.looperthreadpractices;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;

public class LooperThread extends Thread {
    public static final String TAG = "LooperThread";
    public Looper looper;
    public Handler handler;
    private Context context;

    public LooperThread(Context context) {
        this.context = context;
    }

    @Override
    public void  run() {
        looper.prepare();
        looper = looper.myLooper();
        handler = new MyHandler(context);
        looper.loop();
        Log.d(TAG, "End of Run");
    }
}
