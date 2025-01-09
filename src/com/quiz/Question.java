package com.quiz;

public abstract class Question {
    protected String questionText;

    public Question(String questionText) {
        this.questionText = questionText;
    }

    public abstract void displayQuestion();

    public abstract boolean validateAnswer(String userAnswer);
}
