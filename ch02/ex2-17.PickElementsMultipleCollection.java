// collections/fpij/PickElementsMultipleCollection.java

final Predicate<String> startsWithN = name -> name.startsWith("N");

final long = countFriendsStartN =
  friends.stream().filter(startsWithN).count();
final long = countComradesStartN =
  comrades.stream().filter(startsWithN).count();
final long = countEditorsStartN =
  editors.stream().filter(startsWithN).count();
