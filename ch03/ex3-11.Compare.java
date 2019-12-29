// compare/fpij/Compare.java

public static void printPeople(
  final String message, final List<Person> people) {

  System.out.println(message);
  people.forEach(System.out::println);
}
