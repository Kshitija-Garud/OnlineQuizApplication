package com.quiz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OnlineQuizApplication {
    public static void main(String[] args) {
        // Questions for Computer Engineering students
        List<Question> questions = new ArrayList<>();
        questions.add(new MultipleChoiceQuestion("Which language is primarily used for Android development?", 
            new String[]{"Python", "Java", "C++", "Swift"}, 2));
        questions.add(new YesNoQuestion("Is Big O notation used to measure algorithm performance?", true));
        questions.add(new FillInTheBlankQuestion("The OSI model has ____ layers.", "7"));
        questions.add(new MultipleChoiceQuestion("What is the default port for HTTP?", 
            new String[]{"80", "443", "21", "25"}, 1));
        questions.add(new YesNoQuestion("Is a stack a FIFO data structure?", false));
        questions.add(new FillInTheBlankQuestion("TCP stands for ____ Control Protocol.", "Transmission"));

        // User registration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Online Quiz Application!");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = new User(username, password);

        // Start quiz
        Quiz quiz = new Quiz(questions);
        System.out.println("\nStarting the quiz...");
        quiz.startQuiz();

        // Record score
        user.addScore(quiz.getScore());

        // Display user score history
        System.out.println("\nYour score history: " + user.getScoreHistory());
    }
}
