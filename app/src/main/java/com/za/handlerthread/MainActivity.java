package com.za.handlerthread;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final int THREAD_PRIORITY_BACKGROUND = 5;
    private TextView textView;

    private MyHandlerThread handlerThread;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        handlerThread = new MyHandlerThread("MyHandlerThread", THREAD_PRIORITY_BACKGROUND);
        handlerThread.start();


        textView = findViewById(R.id.text);

    }
}
