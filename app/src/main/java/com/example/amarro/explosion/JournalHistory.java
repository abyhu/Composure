package com.example.amarro.explosion;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;


public class JournalHistory extends AppCompatActivity {

    private static final String JOURNAL = "JOURNAL";
    int numEntry = 0;
    ArrayList<JournalEntry> journal;
    int arrayLength;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_journal_history);

        SharedPreferences shref;
        shref = this.getSharedPreferences(JOURNAL, this.MODE_PRIVATE);

        Gson gson = new Gson();
        String response = shref.getString(JOURNAL , "");
        journal = gson.fromJson(response, new TypeToken<ArrayList<JournalEntry>>(){}.getType());

        arrayLength = journal.size();

        String titleNew = journal.get(numEntry).getTitle();
        String dateNew = journal.get(numEntry).getDate().toString();
        String entryNew = journal.get(numEntry).getEntry();


        TextView title = (TextView) findViewById(R.id.journalEntryTitleDisplay);
        title.setText(titleNew);
        TextView date = (TextView) findViewById(R.id.journalDateDisplay);
        date.setText(dateNew);
        TextView entry = (TextView) findViewById(R.id.journalEntryDisplay);
        entry.setText(entryNew);

    }

    public void previousJournalEntry(View view){

        if(numEntry == 0 ) {
            numEntry = arrayLength - 1;
        } else {
            numEntry--;
        }
        String titleNew = journal.get(numEntry).getTitle();
        String dateNew = journal.get(numEntry).getDate().toString();
        String entryNew = journal.get(numEntry).getEntry();


        TextView title = (TextView) findViewById(R.id.journalEntryTitleDisplay);
        title.setText(titleNew);
        TextView date = (TextView) findViewById(R.id.journalDateDisplay);
        date.setText(dateNew);
        TextView entry = (TextView) findViewById(R.id.journalEntryDisplay);
        entry.setText(entryNew);

    }

    public void nextJournalEntry(View view) {
        if(numEntry == arrayLength - 1) {
            numEntry = 0;
        } else {
            numEntry++;
        }
        String titleNew = journal.get(numEntry).getTitle();
        String dateNew = journal.get(numEntry).getDate().toString();
        String entryNew = journal.get(numEntry).getEntry();


        TextView title = (TextView) findViewById(R.id.journalEntryTitleDisplay);
        title.setText(titleNew);
        TextView date = (TextView) findViewById(R.id.journalDateDisplay);
        date.setText(dateNew);
        TextView entry = (TextView) findViewById(R.id.journalEntryDisplay);
        entry.setText(entryNew);
    }

}
