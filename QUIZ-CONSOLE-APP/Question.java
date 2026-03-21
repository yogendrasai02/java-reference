public class Question {
  private int id;
  private String question;
  private String[] options;
  private String answer;

  public Question(int id, String question, String[] options, String answer) {
    this.id = id;
    this.question = question;
    this.options = options;
    this.answer = answer;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public String[] getOptions() {
    return options;
  }

  public void setOptions(String[] options) {
    this.options = options;
  }

  public String getAnswer() {
    return answer;
  }

  public void setAnswer(String answer) {
    this.answer = answer;
  }

  public void displayQuestion() {
    System.out.println("Question %s: %s".formatted(id, question));
    int optionsCount = options.length;
    for (int i = 0; i < optionsCount; i++) {
      System.out.println("Option %s: %s".formatted(i + 1, options[i]));
    }
  }
}
