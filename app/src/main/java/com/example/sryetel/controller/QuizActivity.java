package com.example.sryetel.controller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.sryetel.R;
import com.example.sryetel.model.Question;
import com.example.sryetel.model.QuestionBank;

import java.util.Arrays;

public class QuizActivity extends AppCompatActivity {
    private TextView mQuestionText;
    private Button mAnswer1Btn;
    private Button mAnswer2Btn;
    private Button mAnswer3Btn;
    private Button mAnswer4Btn;

    private QuestionBank mQuestionBank;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mQuestionText = (TextView) findViewById(R.id.quiz_question_txt);
        mAnswer1Btn = (Button) findViewById(R.id.quiz_answer1_btn);
        mAnswer2Btn = (Button) findViewById(R.id.quiz_answer2_btn);
        mAnswer3Btn = (Button) findViewById(R.id.quiz_answer3_btn);
        mAnswer4Btn = (Button) findViewById(R.id.quiz_answer4_btn);

        mQuestionBank = this.generateQuestions();
        nextQuestion();

        mAnswer1Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(0);
            }
        });

        mAnswer2Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(1);
            }
        });

        mAnswer3Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(2);
            }
        });

        mAnswer4Btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validate(3);
            }
        });
    }

    private void nextQuestion() {
        loadQuestion(mQuestionBank.getQuestion());
    }
    private void loadQuestion(Question question) {
        mQuestionText.setText(question.getQuestion());
        mAnswer1Btn.setText(question.getAnswer(0));
        mAnswer2Btn.setText(question.getAnswer(1));
        mAnswer3Btn.setText(question.getAnswer(2));
        mAnswer4Btn.setText(question.getAnswer(3));
    }

    protected void validate(int i) {
        nextQuestion();
    }

    protected QuestionBank generateQuestions() {
        Question question1 = new Question("Who is the creator of Android?",
                new String[] {"Andy Rubin",
                        "Steve Wozniak",
                        "Jake Wharton",
                        "Paul Smith"},
                0);

        Question question2 = new Question("When did the first man land on the moon?",
                new String[] {"1958",
                        "1962",
                        "1967",
                        "1969"},
                3);

        Question question3 = new Question("What is the house number of The Simpsons?",
                new String[] {"42",
                        "101",
                        "666",
                        "742"},
                3);

        return new QuestionBank(Arrays.asList(question1,
                question2,
                question3));
    }
}
