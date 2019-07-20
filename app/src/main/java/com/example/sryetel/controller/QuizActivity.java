package com.example.sryetel.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import com.example.sryetel.R;
import com.example.sryetel.model.Question;

public class QuizActivity extends AppCompatActivity {
    private TextView mQuestionText;
    private Button mAnswer1Btn;
    private Button mAnswer2Btn;
    private Button mAnswer3Btn;
    private Button mAnswer4Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionText = (TextView) findViewById(R.id.quiz_question_txt);
        mAnswer1Btn = (Button) findViewById(R.id.quiz_answer1_btn);
        mAnswer2Btn = (Button) findViewById(R.id.quiz_answer2_btn);
        mAnswer3Btn = (Button) findViewById(R.id.quiz_answer3_btn);
        mAnswer4Btn = (Button) findViewById(R.id.quiz_answer4_btn);
    }

    protected void loadQuestion(Question question) {
        mQuestionText.setText(question.getQuestion());
        mAnswer1Btn.setText(question.getAnswer(0));
        mAnswer2Btn.setText(question.getAnswer(1));
        mAnswer3Btn.setText(question.getAnswer(2));
        mAnswer4Btn.setText(question.getAnswer(3));
    }

    protected void validate(int i) {
        
    }
}
