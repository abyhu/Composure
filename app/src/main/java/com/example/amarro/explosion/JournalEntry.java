package com.example.amarro.explosion;

import java.util.Date;


public class JournalEntry {

    private String title;
    private String entry;
    private Date date;

    public JournalEntry(String title, String entry, Date date) {
        this.title = title;
        this.entry = entry;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
