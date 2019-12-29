// compare/fpij/OlderThan20.java

List<Person> olderThan20 =
  people.stream()
        .filter(person -> person.getAge() > 20)
        .collect(ArrayList::new, ArrayList::add, ArrayList::addAll);
System.out.println("People older than 20: " + olderThan20);
