// resources/fpij/UseInstance.java

@FunctionalInterface
public interface UseInstance<T, X extends Throwable> {
  void accept(T instance) thorws X;
}
