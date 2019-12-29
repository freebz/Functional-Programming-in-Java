// recur/fpij/Factorial.java

public class Factorial {
  public static int factorialRec(final int number) {
    if(number == 1)
      return number;
    else
      return number * factorialRec(number - 1);
  }
}
