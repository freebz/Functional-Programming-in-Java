// compare/fpij/Compare.java

printPeopel("Sorted in ascending order of name: ",
  people.stream()
        .sorted((person1, person2) ->
	   person1.getName.compareTo(person2.getName()))
	.collect(toList()));
