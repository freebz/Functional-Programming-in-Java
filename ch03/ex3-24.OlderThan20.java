// compare/fpij/OlderThan20.java

Map<Integer, List<Person>> nameOfPeopleByAge =
  people.stream()
        .collect(Collectors.groupingBy(Person::getAge, mapping(Person::getName, toList()));
System.out.println("People grouped by age: " + nameOfPeopleByAge);
