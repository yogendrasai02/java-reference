enum StatusCode {
  SUCCESS,
  ERRORRED,
  IN_PROGRESS,
  STUCK;
}

enum ErrorCode {
  // the values inside the brackers => instantiated using a private constructor
  EC_001("network error"),
  EC_002("power fluctuations"),
  EC_003("expired subscription"),
  EC_004("misc");

  // field to store values inside above brackets
  private String value;

  // private constructor
  private ErrorCode(String value) {
    this.value = value;
  }

  public String getValue() {
    return this.value;
  }

  public static ErrorCode fromValue(String value) {
    for (ErrorCode code : values()) {
      // values() => ErrorCode.values()
      if (code.value.equals(value)) {
        return code;
      }
    }
    throw new IllegalArgumentException("No enum constant with value " + value);
  }
}

public class Enums {
  public static void main(String[] args) {
    StatusCode status1 = StatusCode.SUCCESS;
    StatusCode status2 = StatusCode.valueOf("STUCK");
    System.out.println(status1);
    System.out.println(status2);

    ErrorCode ec1 = ErrorCode.EC_001;
    ErrorCode ec2 = ErrorCode.valueOf("EC_003");
    ErrorCode ec3 = ErrorCode.fromValue("misc");
    System.out.println(ec1); // EC_001
    System.out.println(ec1.getValue()); // network error
    System.out.println(ec2);
    System.out.println(ec2.getValue());
    System.out.println(ec3);
    System.out.println(ec3.getValue());
    System.out.println(ec1 == ec2); // false
    System.out.println(ec1 == ErrorCode.EC_001); // true
    System.out.println(ec1.compareTo(ec2)); // -ve value (=> not equal)
    System.out.println(ec1.compareTo(ErrorCode.EC_001)); // 0 (=> equal)
  }
}
