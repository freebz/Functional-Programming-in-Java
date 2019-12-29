// lazy/fpij/LazyStreams.java

Stream<String> namesWith3Letters =
  names.stream()
  .filter(name -> length(name) == 3)
  .map(name -> toUpper(name));

System.out.println("Stream created, filtered, mapped...");
System.out.println("ready to call findFirst...");

final String firstNameWith3Letters =
  namesWith3Letters.findFirst().get();

System.out.println(firstNameWith3Letters);
