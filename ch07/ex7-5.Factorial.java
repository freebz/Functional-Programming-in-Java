// recur/fpij/Factorial.java

public static TailCall<Integer> factorialTailRec(
  final int factorial, final int number) {
  if (number == 1)
    return done(factorial);
  else
    return call(() -> factorialTailRec(factorial * number, number - 1));
}
