// resources/fpij/FileWriterEAM.java

public static void use(final String fileName,
  final UseInstance<FileWriterEAM, IOException> block) throws IOException {

  final FileWriterEAM writerEAM = new FileWriterEAM(fileName);
  try {
    block.accept(writerEAM);
  } finally {
    writerEAM.close();
  }
}
