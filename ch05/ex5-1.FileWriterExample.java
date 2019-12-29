// resources/fpij/FileWriterExample.java

public class FileWriterExample {
  private final FileWriter writer;

  public FileWriterExample(final String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }

  public void writeStuff(final String message) throws IOException {
    writer.write(message);
  }

  public void finalize() throws IOException {
    writer.close();
  }

  //...
}
