package com.xiaowu.setdefaultlauncher;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        finish();
        Intent intent = new Intent(Settings.ACTION_HOME_SETTINGS);
        startActivity(intent);
    }

    public void setDefault(View view) {
        Intent localIntent = new Intent("android.settings.HOME_SETTINGS");
        startActivity(localIntent);
        finish();
    }
}
