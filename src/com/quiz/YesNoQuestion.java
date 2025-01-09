package com.quiz;

public class YesNoQuestion extends Question {
    private boolean correctAnswer;

    public YesNoQuestion(String questionText, boolean correctAnswer) {
        super(questionText);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText + " (yes/no)");
    }

    @Override
    public boolean validateAnswer(String userAnswer) {
        return (userAnswer.equalsIgnoreCase("yes") && correctAnswer) ||
               (userAnswer.equalsIgnoreCase("no") && !correctAnswer);
    }
}
