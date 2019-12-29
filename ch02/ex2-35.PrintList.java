// collections/fpij/PrintList.java

System.out.println(
  friends.stream().map(String::toUpperCase).collect(joining(", ")));
