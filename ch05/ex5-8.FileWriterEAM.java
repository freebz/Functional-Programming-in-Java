// resources/fpij/FileWriterEAM.java

public class FileWriterEAM  {
  private final FileWriter writer;

  private FileWriterEAM(final String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }

  private void close() throws IOException {
    System.out.println("close called automatically...");
    writer.close();
  }

  public void writeStuff(final String message) throws IOException {
    writer.write(message);
  }

  //...
}
