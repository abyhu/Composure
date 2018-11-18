package com.example.amarro.explosion;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class call extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
    }

    public void callhelp (View view) {
        dialContactPhone("");
    }

    //makes a phone call to the target phoneNumber
    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }

    //public void goHome(View view) {
    //  Intent intent = new Intent(this, MainActivity.class);
    // startActivity(intent);
    //}

    public void nextBreathe(View view) {
        Intent myintent = new Intent(call.this, breathe.class);
        call.this.startActivity(myintent);
    }
}
