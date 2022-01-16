package com.example.clickex4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int click_counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void go(View view) {
        click_counter++;
        btn.setText("this is a click number: "+click_counter);
        if (click_counter%7==0){
            btn.setText("BOOM!");
        }
    }
}