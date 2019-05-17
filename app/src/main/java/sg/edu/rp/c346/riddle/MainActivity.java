package sg.edu.rp.c346.riddle;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Event handling Step1
    TextView tvQ1;
    Button btnRevealQ1;
    TextView tvQ2;
    Button btnRevealQ2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity","onCreate() called.");

        //Event handling Step 2
        tvQ1 = findViewById(R.id.textViewQ1);
        btnRevealQ1 = findViewById(R.id.buttonRevealQ1);
        tvQ2 = findViewById(R.id.textViewQ2);
        btnRevealQ2 = findViewById(R.id.button2);

        //Event handling Step3
        btnRevealQ1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent =  new Intent(getBaseContext(), AnswerActivity1.class);
                intent.putExtra("Question","Q1");
                startActivity(intent);
            }
        });

        btnRevealQ2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(getBaseContext(),AnswerActivity2.class);
                intent1.putExtra("Question2","Q2");
                startActivity(intent1);
            }
        });
    }
    @Override
    protected void onStart(){
        Log.d("MainActivity","onStart() called.");
        super.onStart();
    }
    @Override
    protected  void onResume(){
        Log.d("MainActivity","onResume() is called.");
        super.onResume();
    }
    @Override
    protected void onPause(){
        Log.d("MainActivity","onPause() is called.");
        super.onPause();
    }
    @Override
    protected void onStop(){
        Log.d("MainActivity","onStop() is called.");
        super.onStop();
    }
    @Override
    protected void onDestroy(){
        Log.d("MainActivity","OnDestroy() is called.");
        super.onDestroy();
    }
    @Override
    protected void onRestart(){
        Log.d("MainActivity","onRestart() is called.");
        super.onRestart();
    }
}
