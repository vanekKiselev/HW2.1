package com.example.hw21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button buttonOk;
    Button buttonClear;
    TextView resultText;
    EditText userNameInput;
    EditText userEmailInput;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonOk = (Button) findViewById(R.id.buttonOk);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        resultText = (TextView) findViewById(R.id.resultText);
        userNameInput = (EditText) findViewById(R.id.userNameInput);
        userEmailInput = (EditText) findViewById(R.id.userEmailInput);


        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(userNameInput.getText().length() == 0) {
                    resultText.setText(R.string.usernameinput_string);
                    return;
                }
                if(userEmailInput.getText().length() == 0) {
                    resultText.setText(R.string.emailinput_string);
                    return;
                }
                resultText.setText(String.format(getString(R.string.result_string), userNameInput.getText(), userEmailInput.getText()));
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userNameInput.setText(null);
                userEmailInput.setText(null);
                resultText.setText(null);
            }
        });
    }
}