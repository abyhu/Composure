package com.example.amarro.explosion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Date;
import com.google.gson.Gson;
public class TriggerJournal extends AppCompatActivity {
    private static final String TRIGGER_LIST = "TRIGGER_LIST";
    public class TriggerEntryList {
        ArrayList<TriggerEntry> triggerJournal;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trigger_journal);
    }
    public void advancePage (View view) { //connect to next button
        //Thank you for sharing your feelings. This is purposely not saved as the user does not need to
        //review negative experiences. This is meant to be a cathartic experience for the user. Nothing more.
        Toast.makeText(this, "Thank you for sharing your feelings.", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(TriggerJournal.this, MainActivity.class);
        TriggerJournal.this.startActivity(myIntent);
    }

}