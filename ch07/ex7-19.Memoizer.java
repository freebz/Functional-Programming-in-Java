// recur/fpij/Memoizer.java

public class Memoizer {
  public static <T, R> callMemoized(
    final BiFunction<Function<T,R> T, R> function, final T input) {
    Function<T, R> memoized = new Function<T, R>() {
      private final Map<T, R> store = new HashMap<>();
      public R apply(final T input) {
	return store.computeIfAbsent(input, key -> function.apply(this, key));
      }
    };
    return memoized.apply(input);
  }
}
