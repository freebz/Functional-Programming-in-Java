// compare/fpij/OlderThan20.java

Comparator<Person> byAge = Comparator.comparing(Person::getAge);
Map<Character, Optional<Person>> oldestPersonInEachAlphabet =
  people.stream()
        .collect(groupingBy(person -> person.getName().charAt(0),
	   reducing(BinaryOperator.maxBy(byAge))));
System.out.println("Oldest person in each alphabet:");
System.out.println(oldestPersonInEachAlphabet);

