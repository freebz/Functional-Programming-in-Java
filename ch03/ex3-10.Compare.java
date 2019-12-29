// compare/fpij/Compare.java

List<Person> ascendingAge =
  people.stream()
        .sorted((person1, person2) -> person1.ageDifference(person2))
        .collect(toList());

printPeople("Sorted in ascending order of age: ", ascendingAge);
