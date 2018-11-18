package com.example.amarro.explosion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickGreen(View view) {
        Intent myIntent = new Intent(MainActivity.this, GoodJournal.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void onClickYellow(View view) {
        Intent myIntent = new Intent(MainActivity.this, JournalHistory.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void onClickRed(View view) {
        Intent myIntent = new Intent(MainActivity.this, call.class);
        MainActivity.this.startActivity(myIntent);
    }

}
