package com.za.handlerthread;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

import androidx.annotation.LongDef;

public class MyHandlerThread extends HandlerThread {

    private Handler mHandler;

    public MyHandlerThread(String name) {
        super(name);
    }

    public MyHandlerThread(String name, int priority) {
        super(name, priority);
    }

    @Override
    protected void onLooperPrepared() {
        super.onLooperPrepared();
        mHandler = new Handler(getLooper()){
            @Override
            public void handleMessage(Message msg) {
                switch (msg.what){
                    case 1:
                        //Handle Message
                        Log.e("Message1: ", Integer.toString(msg.what));
                        break;
                    case 2:
                        //Handle Message
                        Log.e("Message2: ",  Integer.toString(msg.what));
                        break;
                }
            }
        };
         publishedMethod1();

    }

    public void publishedMethod1()
    {
        mHandler.sendEmptyMessage(1);
    }
    public void publishedMethod2() {
        mHandler.sendEmptyMessage(2); }
}
