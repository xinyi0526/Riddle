package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAns = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String questionsSelected = intentReceived.getStringExtra("Question2");
        tvAns.setText(questionsSelected + " answer is: Gone");
    }
}
