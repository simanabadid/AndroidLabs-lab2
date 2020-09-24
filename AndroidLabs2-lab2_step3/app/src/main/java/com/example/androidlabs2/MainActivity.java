package com.example.androidlabs2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_relative);


        CheckBox checkBox = findViewById(R.id.checkBox);
        checkBox.setOnCheckedChangeListener((CompoundButton, b) -> {

            if (checkBox.isChecked()) {
                Snackbar.make(checkBox, getString(R.string.check1),
                        Snackbar.LENGTH_LONG).setAction(R.string.message, click ->
                        CompoundButton.setChecked(!b))
                        .show();
            } else {
                Snackbar.make(checkBox, getString(R.string.check2),
                        Snackbar.LENGTH_LONG).setAction(R.string.message, click ->
                        CompoundButton.setChecked(!b))
                        .show();
            }
        });

        Switch sw = findViewById(R.id.switch_on_off);
        sw.setOnCheckedChangeListener((CompoundButton, b) -> {

            if (sw.isChecked()) {
                Snackbar.make(sw, getString(R.string.switch_on),
                        Snackbar.LENGTH_LONG).setAction(R.string.message, click ->
                        CompoundButton.setChecked(!b))
                        .show();
            } else {
                Snackbar.make(sw, getString(R.string.switch_off),
                        Snackbar.LENGTH_LONG).setAction(R.string.message, click ->
                        CompoundButton.setChecked(!b))
                        .show();
            }
        });
        Button button = findViewById(R.id.button);
        button.setOnClickListener( v -> { displayToast(v); } );

    }

    public void displayToast(View V){
        String message = getString(R.string.toast_message);
        Toast.makeText(MainActivity.this,
                message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onPause() {
        super.onPause();


    }
}