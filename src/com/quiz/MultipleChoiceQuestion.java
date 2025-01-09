package com.quiz;

public class MultipleChoiceQuestion extends Question {
    private String[] options;
    private int correctAnswer;

    public MultipleChoiceQuestion(String questionText, String[] options, int correctAnswer) {
        super(questionText);
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    @Override
    public void displayQuestion() {
        System.out.println(questionText);
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
    }

    @Override
    public boolean validateAnswer(String userAnswer) {
        try {
            int answer = Integer.parseInt(userAnswer);
            return answer == correctAnswer;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
