// collections/fpij/PickDifferentNames.java

final Function<String, Predicate<String>> startsWithLetter =
  letter -> name -> name.startsWith(letter);
