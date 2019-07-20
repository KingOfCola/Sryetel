package com.example.sryetel;

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
import com.example.sryetel.controller.QuizActivity;

public class MainActivity extends AppCompatActivity {
    private TextView mGreetingText;
    private EditText nameInput;
    private EditText mMessageInput;
    private TextView mAnswerText;
    private Button mValidate;

    boolean bMessageFilled = false;
    boolean bNameFilled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization
        mGreetingText = (TextView) findViewById(R.id.activity_main_name_txt);
        nameInput = (EditText) findViewById(R.id.activity_main_name_input);
        mMessageInput = (EditText) findViewById(R.id.activity_main_message_input);
        mAnswerText = (TextView) findViewById(R.id.activity_main_answer_txt);
        mValidate = (Button) findViewById(R.id.activity_main_validate_btn);

        // Properties
        mValidate.setEnabled(false);

        nameInput.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                bNameFilled = (s.length() != 0);
                mValidate.setEnabled(isAllFieldsfilled());
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
                mValidate.setEnabled(isAllFieldsfilled());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        mValidate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAnswerText.setText(mMessageInput.getText().toString());
                Intent quizActivity = new Intent(MainActivity.this, QuizActivity.class);
                startActivity(quizActivity);
            }
        });
    }

    protected boolean isAllFieldsfilled() {
        return (bMessageFilled & bNameFilled);
    };
}
