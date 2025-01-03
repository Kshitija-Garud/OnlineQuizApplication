
# Online Quiz Application

## Project Overview

The Online Quiz Application is an interactive Java-based system that allows users to participate in quizzes on various topics. It features a wide range of question types, including multiple choice, yes/no, and fill-in-the-blank. The app supports user registration, tracks quiz performance, and provides real-time results.

## Features

- **Question Types**: Multiple Choice, Yes/No, Fill-in-the-Blank.
- **User Registration**: Users can sign up with a username and password.
- **Timed Quizzes**: A countdown timer for each quiz session.
- **Question Randomization**: Questions appear in a random order each time the quiz is taken.
- **Score Tracking**: Users' quiz results are saved in a history list.
- **Instant Feedback**: Immediate feedback on whether the answer is correct or incorrect after each question.
- **Results Summary**: After completing the quiz, the total score and time taken are displayed.

## Technologies Used

- **Java**: Core programming language used to implement the quiz system.
- **Polymorphism**: To manage different question types (Multiple Choice, Yes/No, Fill-in-the-Blank).
- **Java Time API**: For quiz duration calculation using `java.time.Instant` and `java.time.Duration`.
- **Collections Framework**: Used for managing question lists and user score history.

## Class Structure

### 1. `Question` (Abstract Class)
This abstract class serves as the base class for all quiz questions. It includes common properties like `questionText`, `options`, and `correctAnswer`.

### 2. `MultipleChoiceQuestion`, `YesNoQuestion`, `FillInTheBlankQuestion`
These are concrete implementations of the `Question` class. Each handles a specific type of question. 
- `MultipleChoiceQuestion`: For questions with predefined options.
- `YesNoQuestion`: For questions that have only a "Yes" or "No" answer.
- `FillInTheBlankQuestion`: For questions that require text-based answers.

### 3. `Quiz`
This class manages the quiz process, including starting the quiz, tracking the score, and handling the timing. It interacts with the `Question` objects to display them and check user input.

### 4. `User`
This class stores the user's information, including their username, password, and quiz score history.

### 5. `OnlineQuizApplication`
The main entry point for the application, which facilitates user registration, quiz initiation, and score tracking.

## How to Set Up

### Prerequisites
- Java 8 or higher.
- A Java IDE (e.g., IntelliJ IDEA, Eclipse).

### Running the Application

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/yourusername/online-quiz-app.git
   cd online-quiz-app
   ```

2. **Compile and Run**:
   Open the project in your IDE and run the `OnlineQuizApplication` class to start the application.

### Example Command Line Execution

```bash
git clone https://github.com/yourusername/online-quiz-app.git
cd online-quiz-app
javac OnlineQuizApplication.java
java OnlineQuizApplication
```

### Application Workflow

1. **User Registration**: 
   Users enter their username and password to register.
   
2. **Taking the Quiz**: 
   The quiz will begin and the questions will be presented in a randomized order. The user must select or type their answers based on the question type.

3. **Quiz Completion**: 
   Once the user completes the quiz, their score and the time taken are displayed. The user's quiz score history is updated.

4. **Example Output**:
   ```
 Welcome to the Online Quiz Application!
Enter username: Kshitija Garud
Enter password: Kshitija@123

Starting the quiz...
Which language is primarily used for Android development?
1. Python
2. Java
3. C++
4. Swift
Enter your answer: 2
Correct!
Is Big O notation used to measure algorithm performance? (yes/no)
Enter your answer: yes
Correct!
The OSI model has ____ layers. (Fill in the blank)
Enter your answer: 7
Correct!
What is the default port for HTTP?
1. 80
2. 443
3. 21
4. 25
Enter your answer: 1
Correct!
Is a stack a FIFO data structure? (yes/no)
Enter your answer: no
Correct!
TCP stands for ____ Control Protocol. (Fill in the blank)
Enter your answer: Transmission
Correct!

Quiz completed!
Your score: 6/6
Time taken: 32 seconds

Your score history: [6]

   ```

## Design Decisions

- **Polymorphism**: Each type of question (multiple choice, yes/no, fill-in-the-blank) is handled through polymorphism, allowing the `Quiz` class to interact with all question types in a uniform manner.
- **Randomization**: The order of questions is randomized to make each quiz experience unique for the user.
- **Modularity**: The separation of concerns ensures that the `Question`, `Quiz`, `User`, and `OnlineQuizApplication` classes are well-defined and modular.
- **User Data**: The `User` class stores each user’s login credentials and score history in a list, allowing for performance tracking.

## Assumptions

- **Input Validation**: The application assumes that user input is always valid, meaning the user will only enter numbers or text as expected. Further input validation could be added for robustness.
- **User Data Persistence**: The application currently does not persist user data beyond the session (e.g., no database is used).
- **Quiz Flow**: The quiz only proceeds when the user has answered all the questions, and the quiz automatically ends when all questions are answered.

## Possible Future Enhancements

- **Graphical User Interface (GUI)**: Develop a GUI for a better user experience.
- **Persistent Storage**: Implement a database or file-based system to store user data, including their history and scores.
- **Additional Question Types**: Introduce more question types (e.g., image-based questions, true/false questions).
- **Multiple Quiz Topics**: Allow users to select from multiple quiz topics (e.g., general knowledge, science, math, etc.).
