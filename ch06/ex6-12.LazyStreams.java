// lazy/fpij/LazyStreams.java

public static void main(final String[] args) {
  List<String> names = Arrays.asList("Brad", "Kate", "Kim", "Jack", "Joe",
    "Mike", "Susan", "George", "Robert", "Julia", "Parker", "Benson");

  final String firstNameWith3Letters =
    names.stream()
         .filter(name -> length(name) == 3)
         .map(name -> toUpper(name))
         .findFirst()
         .get();

  System.out.println(firstNameWith3Letters);
}
