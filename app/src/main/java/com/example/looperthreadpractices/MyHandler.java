package com.example.looperthreadpractices;

import android.os.Message;
import android.os.Handler;
import android.util.Log;

public class MyHandler extends Handler {

    public static final String TAG = "MyHandler";
    public static final int TASK_A = 1;
    public static final int TASK_B = 2;

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case TASK_A:
                Log.d(TAG, "Task A Excuted");
                break;
            case TASK_B:
                Log.d(TAG, "Task B Excuted");
                break;
        }
    }
}
