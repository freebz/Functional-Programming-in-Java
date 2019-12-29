// recur/fpij/Factorial.java

public static int factorial(final int number) {
  return factorialTailRec(1, number).invoke();
}
