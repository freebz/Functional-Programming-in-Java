// collections/fpij/PickDifferentNames.java

public static Predicate<String> checkIfStartsWith(final String letter) {
  return name -> name.startsWith(letter);
}
