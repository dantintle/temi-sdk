package com.example.hellotemi;

import android.os.Bundle;

import com.robotemi.sdk.RoboEntryPointActivity;

public class BootActivity extends RoboEntryPointActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected Class getMainServiceClassName() {
        return MyService.class;
    }
}
