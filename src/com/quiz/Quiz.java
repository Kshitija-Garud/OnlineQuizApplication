package com.quiz;

import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Scanner;

public class Quiz {
    private List<Question> questions;
    private int score;

    public Quiz(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void startQuiz() {
        Scanner scanner = new Scanner(System.in);
        Instant start = Instant.now();

        for (Question question : questions) {
            question.displayQuestion();
            System.out.print("Enter your answer: ");
            String userAnswer = scanner.nextLine();
            if (question.validateAnswer(userAnswer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect.");
            }
        }

        Instant end = Instant.now();
        long timeElapsed = Duration.between(start, end).toSeconds();

        System.out.println("\nQuiz completed!");
        System.out.println("Your score: " + score + "/" + questions.size());
        System.out.println("Time taken: " + timeElapsed + " seconds");
    }

    public int getScore() {
        return score;
    }
}
