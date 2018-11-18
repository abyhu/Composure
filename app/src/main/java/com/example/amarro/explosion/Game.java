package com.example.amarro.explosion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

//public class Game extends AppCompatActivity {
//
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_game);
//
//        //int randNum = (int) Random.nextInt(100);
//        int userNum;
//
//        do {
//            EditText inputNum = (EditText) findViewById(R.id.editText);
//            String num = inputNum.getText().toString();
//            userNum = Integer.parseInt(num);
//
//            if (userNum < randNum) {
//                if (userNum >= randNum - 10) {
//                    Toast.makeText(this, "Close!", Toast.LENGTH_SHORT).show();
//                }
//                Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
//            } else if (userNum > randNum) {
//                if (userNum <= randNum + 10) {
//                    Toast.makeText(this, "Close!", Toast.LENGTH_SHORT).show();
//                }
//                Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
//            }
//        }
//            while (userNum != randNum) ;
//            Toast.makeText(this, "You Win!", Toast.LENGTH_SHORT).show();
//
//            Intent myIntent = new Intent(Game.this, MainActivity.class);
//            Game.this.startActivity(myIntent);
//
//        }
//    }
//
