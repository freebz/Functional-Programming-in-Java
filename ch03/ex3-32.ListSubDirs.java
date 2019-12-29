// compare/fpij/ListSubDirs.java

public static void listTheHardWay() {
  List<File> files = new ArrayList<>();

  File[] filesInCurrentDir = new File(".").listFiles();
  for(File file : filesInCurrentDir) {
    File[] filesInSubDir = file.listFiles();
    if(filesInSubDir != null) {
      files.addAll(Arrays.asList(filesInSubDir));
    } else {
      files.add(file);
    }
  }

  System.out.println("Count: " + files.size());
}
