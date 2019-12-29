// collections/fpij/PickDifferentNames.java

final Function<String, Predicate<String>> startsWithLetter =
  (String letter) -> (String name) -> name.startsWith(letter);
