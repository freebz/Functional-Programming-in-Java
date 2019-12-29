// recur/fpij/TailCall.java

@FunctionalInterface
public interface TailCall<T> {
  TailCall<T> apply();
  default boolean isComplete() { return false; }

  default T result() { throw new Error("not implemented"); }

  default T invoke() {
    return Stream.iterate(this, TailCall::apply)
                 .filter(TailCall::iscomplete)
                 .findFirst()
                 .get()
                 .result();
  }
}
