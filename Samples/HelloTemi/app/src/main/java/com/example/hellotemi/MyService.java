package com.example.hellotemi;

import android.content.Intent;
import android.os.IBinder;

import com.robotemi.sdk.RoboService;
import com.robotemi.sdk.Robot;

public class MyService extends RoboService {

    @Override
    protected void onRobotReady(Robot robot) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
