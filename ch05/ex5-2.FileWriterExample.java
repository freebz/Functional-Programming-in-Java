// resources/fpij/FileWriterExample.java

public static void main(final String[] args) throws IOException {
  final FileWriterExample writerExample =
    new FileWriterExample("peekaboo.txt");

  writerExample.writeStuff("peek-a-boo");
}
