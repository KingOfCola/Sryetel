package com.example.sryetel.model;

public class Question {
    final private String question;
    final private String[] answers;
    final private int correctAnswer;

    public Question() {
        question = "";
        answers = new String[4];
        correctAnswer = 0;
    }

    public Question(String question, String[] answers, int correctAnswer) {
        this.question = question;
        this.answers = answers.clone();
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer(int i) {
        return answers[i];
    }

    public boolean isCorrect(int answer) {
        return answer == correctAnswer;
    }
}
