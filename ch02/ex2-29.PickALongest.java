// collections/fpij/PickALongest.java

System.out.println("Total number of characters in all names: " +
  friends.stream()
	 .mapToInt(name -> name.length())
	 .sum());
