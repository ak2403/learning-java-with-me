class MyChar {
  public static void main(String args[]) {
    char firstChar = 'a';

    System.out.println("My first char defined is " + firstChar);

    char tabChar = '\t';

    System.out.println("tabChar has created this long " + tabChar + "gap");

    char unicodeChar = '\u05D0';

    System.out.println("The unicode that is defined " + unicodeChar);

    char numberChar = '1';

    System.out.println("The number char is " + numberChar + " and is that a digit - " + Character.isDigit(numberChar));
  }
}
