package com.example.sryetel.model;

public class User {
    private String mName;
    private String profile;
    private int score;

    public User(String name, String profile) {
        this.mName = name;
        this.profile = profile;
        this.score = 0;
    }

    public User() {
        this("", "");
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return mName;
    }

    public String getProfile() {
        return profile;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void addScore(int points) {
        this.score += points;
    }
}
