// compare/fpij/OlderThan20.java

List<Person> olderThan20 = new ArrayList<>();
people.stream()
      .filter(person -> person.getAge() > 20)
      .forEach(person -> olderThan20.add(person));
System.out.println("People older than 20: " + olderThan20);
