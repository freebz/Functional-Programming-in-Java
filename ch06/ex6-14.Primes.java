// lazy/fpij/Primes.java

public class Primes {
  private static int primeAfter(final int number) {
    is(isPrime(number + 1))
      return number + 1;
    else
      return primeAfter(number + 1);
  }

  public static List<Integer> primes(final int fromNumber, final int count) {
    return Stream.iterate(primeAfter(fromNumber - 1), Primes::primeAfter)
      .limit(count).collect(Collectors.<Integer>toList());
  }
  //...
}
