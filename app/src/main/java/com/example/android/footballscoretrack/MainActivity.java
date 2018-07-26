package com.example.android.footballscoretrack;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays a basketball score.
 */
public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int FoulTeamA = 0;
    int FoulTeamB = 0;
    int YellowTeamA =0;
    int YellowTeamB =0;
    int RedTeamA = 0;
    int RedTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the RESET button is clicked.
     */
    public void Reset(View view) {
        displayscoreTeamA(scoreTeamA = 0);
        displayscoreTeamB(scoreTeamB = 0);
        displayFoulForTeamA(FoulTeamA = 0);
        displayFoulForTeamB(FoulTeamB = 0);
        displayYellowForTeamA(YellowTeamA =0);
        displayYellowForTeamB(YellowTeamB =0);
        displayRedForTeamA(RedTeamA = 0);
        displayRedForTeamB(RedTeamB = 0);
    }

    /**
     * This method is called when the "GOOL" button is clicked.
     */
    public void GoolForTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayscoreTeamA(scoreTeamA);
    }

    public void GoolForTeamB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayscoreTeamB(scoreTeamB);
    }

    /**
     * This method is called when the "Foul" button is clicked.
     */
    public void FoulForTeamA(View view) {
        FoulTeamA = FoulTeamA + 1;
        displayFoulForTeamA(FoulTeamA);
    }

    public void FoulForTeamB(View view) {
        FoulTeamB = FoulTeamB + 1;
        displayFoulForTeamB(FoulTeamB);
    }

    /**
     * This method is called when the "Yellow card" button is clicked.
     */
    public void yellowcardForTeamA(View view) {
        YellowTeamA = YellowTeamA + 1;
        displayYellowForTeamA(YellowTeamA);
    }

    public void yellowcardForTeamB(View view) {
        YellowTeamB = YellowTeamB + 1;
        displayYellowForTeamB(YellowTeamB);
    }
    /**
     * This method is called when the "Red card" button is clicked.
     */
    public void RedcardForTeamA(View view) {
        RedTeamA = RedTeamA + 1;
        displayRedForTeamA(RedTeamA);
    }
    public void RedcardForTeamB(View view) {
        RedTeamB = RedTeamB + 1;
        displayRedForTeamB(RedTeamB);
    }


    /**
     * Displays the given score for Team A.
     */
    public void displayscoreTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the Foul for Team A.
     */
    public void displayFoulForTeamA(int Foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_Foul);
        scoreView.setText(String.valueOf(Foul));
    }
    /**
     * Displays the yellow card for Team A.
     */
    public void displayYellowForTeamA(int yellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowCard);
        scoreView.setText(String.valueOf(yellowCard));
    }
    /**
     * Displays the Red card for Team A.
     */
    public void displayRedForTeamA(int RedCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_RedCard);
        scoreView.setText(String.valueOf(RedCard));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayscoreTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the Foul for Team B.
     */
    public void displayFoulForTeamB(int Foul) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_Foul);
        scoreView.setText(String.valueOf(Foul));
    }
    /**
     * Displays the yellow card for Team B.
     */
    public void displayYellowForTeamB(int yellowCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowCard);
        scoreView.setText(String.valueOf(yellowCard));
    }
    /**
     * Displays the Red card for Team B.
     */
    public void displayRedForTeamB(int RedCard) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_RedCard);
        scoreView.setText(String.valueOf(RedCard));
    }

}