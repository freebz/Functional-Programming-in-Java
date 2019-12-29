// collections/fpij/PickALongest.java

final String steveOrLonger =
  friends.stream()
         .reduce("Steve", (name1, name2) ->
	    name1.length() >= name2.length() ? name: "%s", name1 : name2);
