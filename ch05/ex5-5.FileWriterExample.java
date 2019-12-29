// resources/fpij/FileWriterExample.java

final FileWriterExample writerExample =
  new FileWriterExample("peekaboo.txt");

try {
  writerExample.writeStuff("peek-a-boo");
} finally {
  writerExample.close();
}
