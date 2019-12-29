// compare/fpij/Compare.java

Comparator<Person> compareAscending = (person1, person2) ->
  person1.ageDifference(person2);
Comparator<Person> compareDescending = compareAscending.reversed();
