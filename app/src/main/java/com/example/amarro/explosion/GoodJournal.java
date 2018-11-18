package com.example.amarro.explosion;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.ArrayList;
import java.util.Date;


public class GoodJournal extends AppCompatActivity {

    private static final String JOURNAL = "JOURNAL";
    ArrayList<JournalEntry> journal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_good_journal);
    }

    public void saveJournalEntry(View view) {

        EditText title = (EditText) findViewById(R.id.journalEntryTitleInput);
        String titleText = title.getText().toString();

        EditText entry = (EditText) findViewById(R.id.journalEntryInput);
        String entryText = entry.getText().toString();

        Date date = new Date();

        JournalEntry journalEntry = new JournalEntry(titleText, entryText, date);

        SharedPreferences shref;
        SharedPreferences.Editor editor;
        shref = this.getSharedPreferences(JOURNAL, this.MODE_PRIVATE);

        Gson gson = new Gson();
        String response = shref.getString(JOURNAL , "");
        journal = gson.fromJson(response, new TypeToken<ArrayList<JournalEntry>>(){}.getType());

        journal.add(journalEntry);
        String json = gson.toJson(journal);

        editor = shref.edit();
        editor.remove(JOURNAL).commit();
        editor.putString(JOURNAL, json);
        editor.commit();

        Toast.makeText(this, "Your entry has been saved", Toast.LENGTH_LONG).show();

        Intent myIntent = new Intent(GoodJournal.this, MainActivity.class);
        GoodJournal.this.startActivity(myIntent);

    }

}

