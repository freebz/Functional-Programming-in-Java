// resources/fpij/FileWriterARM.java

public class FileWriterARM implements AutoCloseable {
  privnal FileWriter writer;

  public FileWriterARM(final String fileName) throws IOException {
    writer = new FileWriter(fileName);
  }

  public void writeStuff(final String message) throws IOException {
    writer.write(message);
  }

  public void close() throws IOException {,
    System.out.println("close called automatically...");
    writer.close();
  }

  //...
}
