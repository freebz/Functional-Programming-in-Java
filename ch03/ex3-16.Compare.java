// compare/fpij/Compare.java

people.stream()
      .min(Person::ageDifference)
      .ifPresent(youngest -> System.out.println("Youngest: " + youngest));
