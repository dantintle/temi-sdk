package com.example.hellotemi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.robotemi.sdk.Robot;
import com.robotemi.sdk.TtsRequest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sayHello();
    }

    private void sayHello() {
        final TtsRequest ttsRequest = TtsRequest.create("Hello World!", false);
        Robot.getInstance().speak(ttsRequest);
    }
}
