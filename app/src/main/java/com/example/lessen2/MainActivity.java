package com.example.lessen2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int counter = 0;
    private TextView myTextveiw;
    public static final String key1 = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myTextveiw = findViewById(R.id.textView11);
        Log.d("a","on creat work");
    }



    public void cli(View view) {
        counter++;
        if (counter>10){
//            navigateToSecondActivity(); //opsen1
            secendOpshen();
            return;
        }
        myTextveiw.setText(String.valueOf(counter));

    }

    private void secendOpshen() {
        SecendActivity.start(this,counter);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt(key1,counter);
        super.onSaveInstanceState(outState);
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        if (savedInstanceState != null) {
            counter = savedInstanceState.getInt(key1);
            Log.e("ee","ee work"+counter );
            myTextveiw.setText(String.valueOf(counter));

//            UpdateCounterValue(counter);
            super.onRestoreInstanceState(savedInstanceState);
        }
    }

//    private void navigateToSecondActivity() {
//        Intent intenToScen = new Intent(this,SecendActivity.class);
//        intenToScen.putExtra(key1,counter);
//        startActivity(intenToScen);
//    }

    public void les(View view) {
        counter--;
        myTextveiw.setText(String.valueOf(counter));
    }


    @Override
    protected void onDestroy() {
        Log.e("ee","onDestroy work" );
        super.onDestroy();
    }

    @Override
    protected void onStop() {
        Log.e("ee","onStop work" );
        super.onStop();
    }

    @Override
    protected void onPause() {
        Log.e("ee","onPause work" );
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.d("c","onResume work");
        super.onResume();
    }
    @Override
    protected void onStart() {
        Log.d("b","on start work");
        super.onStart();
    }



}
