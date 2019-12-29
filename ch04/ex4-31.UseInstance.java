// designing/fpij/UseInstance.java

@FunctionalInterface
public interface UseInterface<T, X extends Throwable> {
  void accept(T instance) throws X;
}
