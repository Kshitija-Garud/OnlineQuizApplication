package com.quiz;

public class FillInTheBlankQuestion extends Question {
    private String correctAnswer;

    public FillInTheBlankQuestion(String questionText, String correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText + " (Fill in the blank)");
    }

    @Override
    public boolean validateAnswer(String userAnswer) {
        return userAnswer.equalsIgnoreCase(correctAnswer);
    }
}
