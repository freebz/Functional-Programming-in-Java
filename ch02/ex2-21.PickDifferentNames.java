// collections/fpij/PickDifferentNames.java

final Function<String, Predicate<String>> startsWithLetter =
  (String letter) -> {
    Predicate<String> checkStartsWith =
      (String name) -> name.startsWith(letter);
    return checkStartsWith;
};
