package com.panelic.aplikasisaya;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.rinaldi.aplikasisaya.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
      /*
      Menampilkan score Team A di dalam TextView yang di tampilkan
      Menset nilai score yang bertipe data integer

       */


    }

    public void tigaPointA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
        //Menambah Point Team A 3
    }

    public void duaPointA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
        //Menambah Point Team A 2

    }

    public void satuPointA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);

        //Menambah Point Team A 1
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
             /*
      Menampilkan score Team B di dalam TextView yang di tampilkan
      Menset nilai score yang bertipe data integer

       */

    }

    public void tigaPointB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
        // Menambah Point Team B 3

    }

    public void duaPointB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
        // Menambah Point Team B 2
    }

    public void satuPointB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
        // Menambah Point Team B 1
    }


    public void resetPoint(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        //Reset point Team A dan Team B ke 0
        // commit kedua
    }
}