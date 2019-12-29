// compare/fpij/Compare.java

final Function<Person, String> byName = person -> person.getName();
people.stream().sorted(comparing(byName));
