package com.example.looperthreadpractices;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button toHandlerBtn = findViewById(R.id.btn_to_handler);
        toHandlerBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toHandlerPage();
            }
        });
    }

    private void toHandlerPage() {
        Intent intent = new Intent(this, HandlerActivity.class);
        startActivity(intent);
    }
}