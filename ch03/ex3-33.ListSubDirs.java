// compare/fpij/ListSubDirs.java

public static void betterWay() {
  List<File> files = 
    Stream.of(new File(".").listFiles())
          .flatMap(file -> file.listFiles() == null ?
	      Stream.of(file) : Stream.of(file.listFiles()))
          .collect(toList());
  System.out.println("Count: " + files.size());
}
