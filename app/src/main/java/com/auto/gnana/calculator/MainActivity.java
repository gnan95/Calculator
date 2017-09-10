package com.auto.gnana.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);
        Button mul = (Button) findViewById(R.id.mul);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText first = (EditText) findViewById(R.id.first);
                EditText second = (EditText) findViewById(R.id.second);
                TextView result = (TextView) findViewById(R.id.result);

                if (first.getText()== null || second.getText()== null) {
                    result.setText("Enter input");
                }
                else {
                    float num1 = Float.parseFloat(first.getText().toString());
                    float num2 = Float.parseFloat(second.getText().toString());
                    float res = num1 + num2;
                    result.setText(res + "");
                }
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText first = (EditText) findViewById(R.id.first);
                EditText second = (EditText) findViewById(R.id.second);
                TextView result = (TextView) findViewById(R.id.result);

                if (first.getText()== null || second.getText()== null) {
                    result.setText("Enter input");
                }
                else {
                    float num1 = Float.parseFloat(first.getText().toString());
                    float num2 = Float.parseFloat(second.getText().toString());
                    float res = num1 - num2;
                    result.setText(res + "");
                }
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText first = (EditText) findViewById(R.id.first);
                EditText second = (EditText) findViewById(R.id.second);
                TextView result = (TextView) findViewById(R.id.result);

                if (first.getText()== null || second.getText()== null) {
                    result.setText("Enter input");
                }
                else {
                    float num1 = Float.parseFloat(first.getText().toString());
                    float num2 = Float.parseFloat(second.getText().toString());
                    float res = num1 * num2;
                    result.setText(res + "");
                }
            }
        });
    }
}