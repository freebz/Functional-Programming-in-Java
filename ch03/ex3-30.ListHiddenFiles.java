// compare/fpij/ListHiddenFiles.java

final File[] files = new File(".").listFiles(file -> file.isHidden());
