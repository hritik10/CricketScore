package com.example.android.cricketscore;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int wicketsTeamA = 0;
    int wicketsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * @param score score of team A
     *              Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * @param wickets no. of wickets of team A
     *                displays the wickets of team A
     */
    public void wicketsForTeamA(int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wickets);
        scoreView.setText(String.valueOf(wickets));
    }

    /**
     * Increases team A score by 1
     */
    public void addOneForA(View v) {
        if (wicketsTeamA == 10) {
            Toast.makeText(this, "Team A is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases team A score by 4
     */
    public void addFourForA(View v) {
        if (wicketsTeamA == 10) {
            Toast.makeText(this, "Team A is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases team A score by 6
     */
    public void addSixForA(View v) {
        if (wicketsTeamA == 10) {
            Toast.makeText(this, "Team A is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increases team A wickets by 1
     */
    public void outForTeamA(View v) {
        if (wicketsTeamA == 10) {
            Toast.makeText(this, "Team A is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        wicketsTeamA++;
        wicketsForTeamA(wicketsTeamA);
    }

    /**
     * @param score score of team B
     *              Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * displays the wickets of team B
     *
     * @param wickets no. of wickets of team B
     */
    public void wicketsForTeamB(int wickets) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wickets);
        scoreView.setText(String.valueOf(wickets));
    }

    /**
     * Increases team B score by 1
     */
    public void addOneForB(View v) {
        if (wicketsTeamB == 10) {
            Toast.makeText(this, "Team B is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases team B score by 4
     */
    public void addFourForB(View v) {
        if (wicketsTeamB == 10) {
            Toast.makeText(this, "Team B is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases team B score by 6
     */
    public void addSixForB(View v) {
        if (wicketsTeamB == 10) {
            Toast.makeText(this, "Team B is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increases team B wicket by 1
     */
    public void outForTeamB(View v) {
        if (wicketsTeamB == 10) {
            Toast.makeText(this, "Team B is All Out", Toast.LENGTH_SHORT).show();
            return;
        }
        wicketsTeamB++;
        wicketsForTeamB(wicketsTeamB);
    }

    /**
     * resets all the parameters to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        wicketsTeamA = 0;
        wicketsTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        wicketsForTeamB(wicketsTeamB);
        wicketsForTeamA(wicketsTeamA);
    }
}
