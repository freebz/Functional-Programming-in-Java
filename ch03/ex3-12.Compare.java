// compare/fpij/Compare.java

printPeopel("Sorted in descending order of age: ",
  people.stream()
	.sorted((person1, person2) -> person2.ageDifference(person1))
	.collect(toList()));
