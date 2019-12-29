// compare/fpij/Compare.java

final Function<Person, Integer> byAge = person -> person.getAge();
final Function<Person, String> byTheirName = person -> person.getName();

printPeople("Sroted in ascending order of age and name: ",
  people.stream()
	.sorted(comparing(byAge).thenComparing(byTheirName))
	.collect(toList()));
