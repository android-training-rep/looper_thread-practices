package com.example.looperthreadpractices;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Message;
import android.view.View;
import android.widget.Button;

public class HandlerActivity extends AppCompatActivity {

    LooperThread looperThread = new LooperThread(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handler);

        Button startBtn = findViewById(R.id.btn_start);
        Button endBtn = findViewById(R.id.btn_end);

        Button taskABtn = findViewById(R.id.btn_task_a);
        Button taskBBtn = findViewById(R.id.btn_task_b);
        taskABtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taskA();
            }
        });
        taskBBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                taskB();
            }
        });
        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               start();
            }
        });
        endBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                end();
            }
        });
    }

    private void start() {
        looperThread.start();
    }

    private void end() {
        looperThread.looper.quit();
    }

    private void taskB() {
        Message msg = Message.obtain();
        msg.what = FinalFields.TASK_B;
        looperThread.handler.sendMessage(msg);
    }

    private void taskA() {
        Message msg = Message.obtain();
        msg.what = FinalFields.TASK_A;
        looperThread.handler.sendMessage(msg);
    }
}