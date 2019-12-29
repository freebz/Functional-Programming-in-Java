// collections/fpij/PickElements.java

final List<Sting> startsWithN =
  friends.stream()
         .filter(name -> name.startsWith("N"))
         .collect(Collectors.toList());
