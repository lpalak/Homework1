package com.example.palak.homework1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class activity2 extends ActionBarActivity {

    private EditText answerText;
    private Button buttonDelete;
    private Button buttonSin;
    private Button buttonCos;
    private Button buttonTan;
    private Button buttonLn;
    private Button buttonLog;
    private Button buttonPi;
    private Button buttonLoge;
    private Button buttonPercent;
    private Button buttonSqrt;
    private Button buttonFact;
    private Button buttonExp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2);

        answerText = (EditText) findViewById(R.id.answer);

        buttonSin = (Button)findViewById(R.id.buttonSin);
        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonSin.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonCos = (Button)findViewById(R.id.buttonCos);
        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonCos.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonTan = (Button)findViewById(R.id.buttonTan);
        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonTan.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonLn = (Button)findViewById(R.id.buttonLn);
        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonLn.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonLog = (Button)findViewById(R.id.buttonLog);
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonLog.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonPi = (Button)findViewById(R.id.buttonPi);
        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonPi.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonLoge = (Button)findViewById(R.id.buttonE);
        buttonLoge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonLoge.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonPercent = (Button)findViewById(R.id.buttonPercent);
        buttonPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonPercent.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonSqrt = (Button)findViewById(R.id.buttonSqrt);
        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonSqrt.getText().toString();
                callBasicCalculator(text);
            }
        });
        buttonFact = (Button)findViewById(R.id.buttonFact);
        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonFact.getText().toString();
                callBasicCalculator(text);
            }
        });
        buttonExp = (Button)findViewById(R.id.buttonExp);
        buttonExp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text  = buttonExp.getText().toString();
                callBasicCalculator(text);
            }
        });

        buttonDelete = (Button) findViewById(R.id.delete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (oldText.length() <= 1)
                    oldText = "";
                else
                    oldText = oldText.substring(0, oldText.length() - 1);

                answerText.setText("");
            }
        });
    }

    public void callBasicCalculator(String text){
        Intent intent = new Intent(activity2.this, MainActivity.class);
        intent.putExtra("Operator" , text);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
        startActivity(intent);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity2, menu);
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

    public void setAnswerText(String text){
         answerText.setText(text.toString()+"(");

    }
}
