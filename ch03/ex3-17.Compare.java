// compare/fpij/Compare.java

people.stream()
      .man(Person::ageDifference)
      .ifPresent(eldest -> System.out.println("Eldest: " + eldest));
