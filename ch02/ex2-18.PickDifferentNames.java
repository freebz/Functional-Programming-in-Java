// collections/fpij/PickDifferentNames.java

final Predicate<String> startsWithN = name -> name.startsWith("N");
final Predicate<String> startsWithB = name -> name.startsWith("B");

final long = countFriendsStartN =
  friends.stream().filter(startsWithN).count();

final long = countFriendsStartB =
  friends.stream().filter(startsWithB).count();
