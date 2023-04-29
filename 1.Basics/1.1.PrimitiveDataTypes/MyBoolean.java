class MyBoolean {
  static boolean isDefault;

  public static void main(String args[]) {

    System.out.println("The default value of boolean if not assigned is " + isDefault);

    System.out.println("=========== Boolean value - true ===========");

    boolean isTrue = true;

    System.out.println("The value of boolTrue is " + isTrue);

    /**
     * There are multiple ways of validating a boolean.
     */
    if (isTrue == true) {
      System.out.println("Way 1 - if condition has been satisifed");
    }

    if (isTrue) {
      System.out.println("Way 2 - if condition has been satisifed");
    }

    System.out.println("=========== Boolean value - false ===========");

    boolean isFalse = false;

    System.out.println("The value of isFalse is " + isFalse);

    /**
     * There are multiple ways of validating a boolean.
     */
    if (isFalse == false) {
      System.out.println("Way 1 - if condition has been satisifed");
    }

    if (!isFalse) {
      System.out.println("Way 2 - if condition has been satisifed");
    }
  }
}