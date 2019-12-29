// recur/fpij/BigFactorial.java

private static TailCall<BigInteger> factorialTailRec(
  final BigInteger factorial, final BigInteger number) {

  if(number.equals(BigInteger.ONE))
    return done(factorial);
  else
    return call(() ->
      factorialTailRec(multiply(factorial, number), decrement(number)));
}

public static BigInteger factorial(final BigInteger number) {
  return factorialTailRec(BigInteger.ONE, number).invoke();
}
