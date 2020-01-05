package com.example.lessen2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.lessen2.MainActivity.key1;

public class SecendActivity extends AppCompatActivity {

    private static final String key2 = "key";
    public static int count;

    TextView tt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
//        int counterFormActiviti = getIntent().getIntExtra(key1,-1); //opshen1
//        if (counterFormActiviti != -1){
//            Toast.makeText(this,"data counter come " + counterFormActiviti , Toast.LENGTH_SHORT).show();
//            tt= findViewById(R.id.textv);
//            tt.setText(String.valueOf(counterFormActiviti));
//        }else {
//            Toast.makeText(this,"data counter not come", Toast.LENGTH_SHORT).show();
//        }

        Toast.makeText(this,"opshen 2 data counter come " + SecendActivity.count , Toast.LENGTH_SHORT).show();
        tt= findViewById(R.id.textv);
        tt.setText(String.valueOf(SecendActivity.count));
    }

    public static void start (Context con, int counter){
        Intent intent2 = new Intent(con,SecendActivity.class);
//        intent2.putExtra(key2,counter);
        SecendActivity.count=counter;
        con.startActivity(intent2);

    }
}
