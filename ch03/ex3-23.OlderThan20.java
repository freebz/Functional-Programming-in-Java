// compare/fpij/OlderThan20.java

Map<Integer, List<Person>> peopleByAge =
  people.stream()
        .collect(Collectors.groupingBy(Person::getAge));
System.out.println("People grouped by age: " + peopleByAge);
