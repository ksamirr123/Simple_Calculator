package com.example.simple_calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Add(View v) {
        EditText et1 = (EditText) findViewById(R.id.edit1);
        EditText et2 = (EditText) findViewById(R.id.edit2);
        EditText et3 = (EditText) findViewById(R.id.edit3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 + n2;
        et3.setText("Total Value: " + result);
    }

    public void Subtract(View v) {
        EditText et1 = (EditText) findViewById(R.id.edit1);
        EditText et2 = (EditText) findViewById(R.id.edit2);
        EditText et3 = (EditText) findViewById(R.id.edit3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 - n2;
        et3.setText("Subtract Value: " + result);
    }
//change 1
    public void Multiply(View v) {
        EditText et1 = (EditText) findViewById(R.id.edit1);
        EditText et2 = (EditText) findViewById(R.id.edit2);
        EditText et3 = (EditText) findViewById(R.id.edit3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 * n2;
        et3.setText("Multiply Value: " + result);
    }

    public void Division(View v) {
        EditText et1 = (EditText) findViewById(R.id.edit1);
        EditText et2 = (EditText) findViewById(R.id.edit2);
        EditText et3 = (EditText) findViewById(R.id.edit3);

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());
        int result = n1 / n2;
        et3.setText("Division Value: " + result);
    }
}
