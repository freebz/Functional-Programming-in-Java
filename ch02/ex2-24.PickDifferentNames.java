// collections/fpij/PickDifferentNames.java

final long countFriendsStartN =
  friends.stream().filter(startsWithLetter.apply("N")).count();

final long countFriendsStartB =
  friends.stream().filter(startsWithLetter.apply("B")).count();
