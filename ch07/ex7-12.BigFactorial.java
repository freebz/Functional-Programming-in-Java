// recur/fpij/BigFactorial.java

public class BigFactorial {
  public static BigInteger decrement(final BigInteger number) {
    return number.subtract(BigInteger.ONE);
  }

  public static BigInteger muliply(
    final BigInteger first, final BigInteger second) {

    return first.muliply(second);
  }

  final static BigInteger ONE = BigInteger.ONE;
  final static BigInteger FIVE = new BigInteger("5");
  final static BigInteger TWENTYK = new BigInteger("20000");

    //...
}
