package appewtc.masterung.baringame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowScore extends AppCompatActivity {

    private int scoreAnInt;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_score);

        scoreAnInt = getIntent().getIntExtra("Score", 0);
        textView = (TextView) findViewById(R.id.textView4);
        textView.setText(Integer.toString(scoreAnInt) + " คะแนน");

    }   // Main Method

    public void clickPlay(View view) {
        startActivity(new Intent(ShowScore.this, Mode.class));
        finish();
    }

    public void clickExit(View view) {
        finish();
    }

}   // Main Class
