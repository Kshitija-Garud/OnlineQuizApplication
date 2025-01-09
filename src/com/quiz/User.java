package com.quiz;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Integer> scoreHistory;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.scoreHistory = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public boolean validatePassword(String password) {
        return this.password.equals(password);
    }

    public void addScore(int score) {
        scoreHistory.add(score);
    }

    public List<Integer> getScoreHistory() {
        return scoreHistory;
    }
}
