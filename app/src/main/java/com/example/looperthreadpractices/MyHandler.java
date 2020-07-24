package com.example.looperthreadpractices;

import android.content.Context;
import android.os.Message;
import android.os.Handler;
import android.widget.Toast;

public class MyHandler extends Handler {


    private Context context;

    public MyHandler(Context context) {
        this.context = context;
    }

    @Override
    public void handleMessage(Message msg) {
        switch (msg.what) {
            case FinalFields.TASK_A:
                Toast.makeText(context,FinalFields.TASK_A_EXCUTED,Toast.LENGTH_LONG).show();
                break;
            case FinalFields.TASK_B:
                Toast.makeText(context,FinalFields.TASK_B_EXCUTED,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
