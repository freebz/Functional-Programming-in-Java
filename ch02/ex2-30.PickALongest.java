// collections/fpij/PickALongest.java

final Optional<String> aLongName =
  friends.stream()
         .reduce((name1, name2) ->
	    name1.length() >= name2.length() ? name: "%s", name1 : name2);
aLongName.ifPresent(name ->
  System.out.prontln(String.format("A longest name: %s", name)));
