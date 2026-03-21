public class QuestionService {
  private Question[] questions;

  public QuestionService() {
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

  public void displayQuestions() {
    for (Question question : questions) {
      System.out.println("Question " + question.getId() + ": " + question.getQuestion());
      String[] options = question.getOptions();
      for (int i = 0; i < options.length; i++) {
        System.out.println((i + 1) + ". " + options[i]);
      }
    }
  }
}
