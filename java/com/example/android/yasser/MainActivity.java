package com.example.android.yasser;

    import android.support.v7.app.AppCompatActivity;
    import android.os.Bundle;
    import android.view.Menu;
    import android.view.MenuItem;
    import android.view.View;
    import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int x;int y;

    public void addOneForTeamA(View v){
        x=x+1;
        displayForTeamA(x);
    }
    public void addTwoForTeamA(View v){
        x=x+2;
        displayForTeamA(x);
    }
    public void addThreeForTeamA(View v){
        x=x+3;
        displayForTeamA(x);
    }



    public void addOneForTeamB(View v){
        y=y+1;
        displayForTeamB(y);
    }
    public void addTwoForTeamB(View v){
        y=y+2;
        displayForTeamB(y);
    }
    public void addThreeForTeamB(View v){
        y=y+3;
        displayForTeamB(y);
    }
    public void resetScore(View v){
        x=0;
        y=0;
        displayForTeamA(x);
        displayForTeamB(y);
    }
    /**
     * Displays the given score for Team A.
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
