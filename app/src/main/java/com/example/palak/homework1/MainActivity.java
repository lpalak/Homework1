package com.example.palak.homework1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private Button delete;
    private Button button0;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button buttonAdd;
    private Button buttonSubtract;
    private Button buttonDivide;
    private Button buttonMultiply;
    private Button buttonDot;
    private Button buttonEqual;
    private Button buttonDelete;
    private EditText answerText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        answerText = (EditText) findViewById(R.id.answer);

        Intent intent = getIntent();
        answerText.setText("");
        if(intent.getStringExtra("Operator") != null)
            answerText.setText(intent.getStringExtra("Operator")+"(");

        button0 = (Button) findViewById(R.id.button0);
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = button0.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button1.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button2.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button3.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button4.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button5 = (Button) findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button5.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button6 = (Button) findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button6.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button7 = (Button) findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button7.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button8 = (Button) findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button8.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        button9 = (Button) findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String text = button9.getText().toString();
                String oldText = answerText.getText().toString();
                setAnswerText(oldText, text);
            }
        });

        buttonAdd = (Button) findViewById(R.id.buttonAdd);
        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (!oldText.isEmpty()) {
                    if (!(oldText.endsWith("+")))
                        setAnswerText(oldText, "+");
                }
            }
        });

        buttonSubtract = (Button) findViewById(R.id.buttonSubtract);
        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (!oldText.isEmpty()) {
                    if (!(oldText.endsWith("-")))
                        setAnswerText(oldText, "-");
                }
            }
        });

        buttonDivide = (Button) findViewById(R.id.buttonDivide);
        buttonDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (!oldText.isEmpty()) {
                    if (!(oldText.endsWith("/")))
                        setAnswerText(oldText, "/");
                }
            }
        });

        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (!oldText.isEmpty()) {
                    if (!(oldText.endsWith("*")))
                        setAnswerText(oldText, "*");
                }
            }
        });

        buttonDot = (Button)findViewById(R.id.buttonDot);
        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (!oldText.isEmpty()) {
                    if (!(oldText.endsWith(".")))
                        setAnswerText(oldText, ".");
                }
            }
        });


        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String answerView = answerText.getText().toString();
                String[] numbers;
                String[] operand;

                numbers = answerView.split("\\D");
                operand = answerView.split("[0-9]*");
                int leftOperand = 0;
                int rightOperand = 0;
                int result = 0;

                if (answerView.contains("+")) {
                    calculateBasic("+");
                } else if (answerView.contains("-")) {
                    calculateBasic("-");
                } else if (answerView.contains("/")) {
                    calculateBasic("/");
                } else if (answerView.contains("*")) {
                    calculateBasic("*");
                } else if (answerView.contains("sin")){
                    calculateAdvance("sin");
                } else if (answerView.contains("cos")){
                    calculateAdvance("cos");
                } else if (answerView.contains("tan")){
                    calculateAdvance("tan");
                } else if (answerView.contains("ln")){
                    calculateAdvance("ln");
                } else if (answerView.contains("log")) {
                    calculateAdvance("log");
                } else if (answerView.contains("π")) {
                    calculateAdvance("pi");
                } else if (answerView.contains("%")) {
                    calculateAdvance("percent");
                } else if (answerView.contains("!")) {
                    calculateAdvance("fact");
                } else if (answerView.contains("√")) {
                    calculateAdvance("sqrt");
                } else if (answerView.contains("^")) {
                    calculateAdvance("sqr");
                }
            }
        });

        buttonDelete = (Button) findViewById(R.id.buttonDelete);
        buttonDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String oldText = answerText.getText().toString();
                if (oldText.length() <= 1)
                    oldText = "";
                else
                    oldText = oldText.substring(0, oldText.length() - 1);

                setAnswerText(oldText, "");
            }
        });

    }

    public void setAnswerText(String oldText, String newText) {
        answerText.setText(oldText + newText);
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
            Intent intent = new Intent(MainActivity.this, activity2.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NO_HISTORY);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void calculateBasic(String operator) {
        double leftOperand = 0;
        double rightOperand = 0;
        double result = 0;
        String answerView = answerText.getText().toString();
        String[] answer;

        answer = answerView.split("\\" + operator);
        leftOperand = Double.parseDouble(answer[0]);
        rightOperand = Double.parseDouble(answer[1]);
        if (operator == "+")
            result = leftOperand + rightOperand;
        else if (operator == "-")
            result = leftOperand - rightOperand;
        else if (operator == "*")
            result = leftOperand * rightOperand;
        else
            result = leftOperand / rightOperand;

        setAnswerText(String.valueOf(result), "");
    }

    public void calculateAdvance(String operator){

        double rightOperand = 0;
        double result = 0;
        String answerView = answerText.getText().toString();
        String[] answer;

        answer = answerView.split("\\(");
        rightOperand = Double.parseDouble(answer[1]);

        if(operator == "sin"){
            result = Math.sin(rightOperand/180*Math.PI);
        } else if (operator == "cos"){
            result = Math.cos(rightOperand/180*Math.PI);
        } else if (operator == "tan"){
            result = Math.tan(rightOperand/180*Math.PI);
        } else if (operator == "ln") {
            result = Math.log(rightOperand/180*Math.PI);
        } else if (operator == "log") {
            result = Math.log10(rightOperand/180*Math.PI);
        } else if (operator == "pi") {
            result = rightOperand*Math.PI;
        } else if (operator == "percent") {
            result = rightOperand/100;
        } else if (operator == "sqr") {
            result = rightOperand*rightOperand;
        } else if (operator == "sqrt") {
            result = Math.sqrt(rightOperand);
        } else if (operator == "fact") {
            double n =Double.valueOf(rightOperand);
            int result1=1;
            for (int i = 1; i <= n; i++) {
                result1 *= i;
            }
            result=result1;
        }
        setAnswerText(String.valueOf(result), "");

    }
}
