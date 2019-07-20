package com.example.sryetel.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.sryetel.R;

public class MainActivity extends AppCompatActivity {
    private TextView mGreetingText;
    private EditText mNameInput;
    private EditText mMessageInput;
    private Button mValidate;

    boolean bMessageFilled = true;
    boolean bNameFilled = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization
        mGreetingText = findViewById(R.id.activity_main_name_txt);
        mNameInput = findViewById(R.id.activity_main_name_input);
        mMessageInput = findViewById(R.id.activity_main_message_input);
        mValidate = findViewById(R.id.activity_main_validate_btn);

        mNameInput.setText("Patate");
        mMessageInput.setText("Patate");

        // Properties
        mValidate.setEnabled(isAllFieldsFilled());

        mNameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                bNameFilled = (s.length() != 0);
                mValidate.setEnabled(isAllFieldsFilled());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mMessageInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                bMessageFilled = (s.length() != 0);
                mValidate.setEnabled(isAllFieldsFilled());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent quizActivity = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(quizActivity);
            }
        });
    }

    protected boolean isAllFieldsFilled() {
        return (bMessageFilled & bNameFilled);
    };
}
