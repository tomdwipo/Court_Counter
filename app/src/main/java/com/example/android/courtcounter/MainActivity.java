package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Displays the given score for 3 point button A.
     */
    public void tigapointA(View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for 2 point button A.
     */
    public void duapointA(View view){
        scoreTeamA = scoreTeamA+2;
        displayForTeamA(scoreTeamA);
        displayForTeamA(scoreTeamA);
    }
    /**
     * Displays the given score for free throw button A.
     */
    public void freeA(View view){
        scoreTeamA = scoreTeamA+1;
        displayForTeamA(scoreTeamA);
        displayForTeamA(scoreTeamA);
    }


    /**
     * Displays the given score for 3 point button B.
     */
    public void tigapointB(View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for 2 point button B.
     */
    public void duapointB(View view){
        scoreTeamB = scoreTeamB+2;
        displayForTeamB(scoreTeamB);
        displayForTeamB(scoreTeamB);
    }
    /**
     * Displays the given score for free throw button A.
     */
    public void freeB(View view){
        scoreTeamB = scoreTeamB+1;
        displayForTeamB(scoreTeamB);
        displayForTeamB(scoreTeamB);
    }
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    /**
     * Displays the given score for Team A..
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

}
