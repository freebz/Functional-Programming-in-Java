// compare/fpij/ListDirs.java

Files.list(Paths.get("."))
     .filter(FIles::isDirectory)
     .forEach(System.out::println);
