// compare/fpij/Compare.java

printPeopel("Sorted in ascending order of age: ",
  people.stream()
        .sorted(compareAscending)
	.collect(toList())
);

printPeopel("Sorted in descending order of age: ",
  people.stream()
        .sorted(compareDescending)
	.collect(toList())
);
