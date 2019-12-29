// collections/fpij/PickDifferentNames.java

final long countFriendsStartN =
  friends.stream().filter(checkIfStartsWith("N")).count();

final long countFriendsStartB =
  friends.stream().filter(checkIfStartsWith("B")).count();
