package com.example.lessen2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView myTextveiw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextveiw = findViewById(R.id.textView11);
    }

    public void cli(View view) {
        counter++;
        myTextveiw.setText(String.valueOf(counter));

    }

    public void les(View view) {
        counter--;
        myTextveiw.setText(String.valueOf(counter));
    }

//    public void bigFuncshen (View view) {
//        Button bb = (Button) view;
//        if (bb.id)
//        counter--;
//        myTextveiw.setText(String.valueOf(counter));
//
//    }
}
