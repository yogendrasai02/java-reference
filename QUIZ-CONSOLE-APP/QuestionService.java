import java.util.Scanner;

public class QuestionService {
  private Question[] questions;
  private int[] userSelections;

  public QuestionService() {
    userSelections = new int[5];

    // hardcode 5 questions
    questions = new Question[5];
    questions[0] = new Question(1, "What is the capital of France?",
        new String[] { "Paris", "London", "Berlin", "Madrid" }, "Paris");
    questions[1] = new Question(2, "What is the largest planet in our solar system?",
        new String[] { "Earth", "Mars", "Jupiter", "Saturn" }, "Jupiter");
    questions[2] = new Question(3, "What is the chemical symbol for water?",
        new String[] { "H2O", "CO2", "O2", "NaCl" }, "H2O");
    questions[3] = new Question(4, "Who wrote 'To Kill a Mockingbird'?",
        new String[] { "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald" }, "Harper Lee");
    questions[4] = new Question(5, "What is the smallest prime number?", new String[] { "0", "1", "2", "3" }, "2");
  }

  public void displayAllQuestions() {
    for (Question question : questions) {
      System.out.println("Question " + question.getId() + ": " + question.getQuestion());
      String[] options = question.getOptions();
      for (int i = 0; i < options.length; i++) {
        System.out.println((i + 1) + ". " + options[i]);
      }
    }
  }

  public void playQuiz() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 5; i++) {
      Question q = questions[i];
      q.displayQuestion();
      System.out.print("Enter your choice: ");
      userSelections[i] = sc.nextInt();
    }
    System.out.println("Your selections:");
    for (int selection : userSelections) {
      System.out.println(selection);
    }
    sc.close();
  }

  public void calculateAndDisplayScore() {
    int correct = 0, wrong = 0;
    for (int i = 0; i < 5; i++) {
      String answer = questions[i].getAnswer();
      int selectedOptionNumber = userSelections[i];
      if (answer.equals(questions[i].getOptions()[selectedOptionNumber - 1])) {
        correct++;
      } else {
        wrong++;
      }
    }
    System.out.println("Correct count: %s | Wrong count: %s".formatted(correct, wrong));
  }
}
