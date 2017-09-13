package com.example.a1694174.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class Main22Activity extends AppCompatActivity {



    String display = "0";
    TextView tv;
    String stored;
    String operation;

    TextView storedTextView;
    TextView displayTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);

        Button button1 = (Button) findViewById(R.id.Button);





        tv = (TextView) findViewById(R.id.textView);

    }

    public void button1(View v) {
        display = display + "1";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button2(View v) {
        display = display + "2";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button3(View v) {
        display = display + "3";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button4(View v) {
        display = display + "4";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button5(View v) {
        display = display + "5";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button6(View v) {
        display = display + "6";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button7(View v) {
        display = display + "7";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button8(View v) {
        display = display + "8";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button9(View v) {
        display = display + "9";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void button0(View v) {
        display = display + "0";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void buttonDot(View v) {
        display = display + ".";
        displayTextView.setText(display);
        tv.setText(display);
    }

    public void buttonPlus(View v) {
        display = "+";
        stored = display;
        displayTextView.setText(display);
        storedTextView.setText(stored);
        tv.setText(display);
        operation = "+";
    }

    public void buttonMinus(View v) {
        display = "-";
        stored = display;
        displayTextView.setText(display);
        storedTextView.setText(stored);
        tv.setText(display);
        operation = "-";
    }

    public void buttonEquals(View v) {
        int left = Integer.parseInt(stored);
        int right = Integer.parseInt(display);
        int calculation = 0;

        if (operation.equals("+")) {
            calculation = left + right;
        } else if (operation.equals("-")) {
            calculation = left - right;
        }

        String result = "" + calculation;
        tv.setText(result);
        display = result;
        displayTextView.setText(display);
        storedTextView.setText(stored);
    }
}