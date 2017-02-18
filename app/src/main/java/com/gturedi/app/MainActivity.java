package com.gturedi.app;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.gturedi.views.CustomStateOptions;
import com.gturedi.views.StatefulLayout;

/**
 * Created by gturedi on 17.02.2017.
 */
public class MainActivity
        extends AppCompatActivity {

    private StatefulLayout stateful;

    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            Toast.makeText(MainActivity.this, "click!", Toast.LENGTH_SHORT).show();
        }
    };

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        stateful = (StatefulLayout) findViewById(R.id.stateful);
    }

    public void content(View view) {
        stateful.showContent();
    }

    public void loading(View view) {
        stateful.showLoading();
    }

    public void empty(View view) {
        stateful.showEmpty();
    }

    public void error(View view) {
        stateful.showError(runnable);
    }

    public void offline(View view) {
        stateful.showOffline(runnable);
    }

    public void locationOff(View view) {
        stateful.showLocationOff(runnable);
    }

    public void custom(View view) {
        //stateful.showCustom(new CustomStateOptions().image(R.drawable.ic_bluetooth_disabled_black_24dp));
        //stateful.showCustom(new CustomStateOptions().image(R.drawable.ic_bluetooth_disabled_black_24dp).message("please open bluetooth"));
        //stateful.showCustom(new CustomStateOptions().message("hey yow!"));
        //stateful.showCustom(new CustomStateOptions().message("hey yow!").buttonAction(runnable));
        stateful.showCustom(new CustomStateOptions().image(R.drawable.ic_bluetooth_disabled_black_24dp).message("please open bluetooth").buttonText("settings").buttonAction(runnable));
    }

}
