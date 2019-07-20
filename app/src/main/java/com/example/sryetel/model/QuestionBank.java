package com.example.sryetel.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionBank {
    private List<Question> mQuestionList;
    private int mQuestionIndex;

    public QuestionBank(List<Question> questionList) {
        mQuestionList = questionList;
        Collections.shuffle(mQuestionList);
        mQuestionIndex = 0;
    }

    public QuestionBank() {
        this(new ArrayList<Question>());
    }

    public Question getQuestion() {
        Question question = mQuestionList.get(mQuestionIndex);
        mQuestionIndex ++;
        if (mQuestionIndex >= mQuestionList.size()) {
            mQuestionIndex = 0;
            Collections.shuffle(mQuestionList);
        }
        return question;
    }
}
