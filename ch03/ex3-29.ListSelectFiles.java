// compare/fpij/ListSelectFiles.java

Files.newDirectoryStream(
  Paths.get("fpij"), path -> path.toString().endsWith(".java"))
.forEach(System.out::println);
