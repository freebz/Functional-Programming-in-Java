// resources/fpij/FileWriterARM.java

try(final FileWriterARM writerARM = new FileWriterARM("peekaboo.txt")) {
  writerARM.writeStuff("peek-a-boo");
  System.out.println("done with the resource...");
}
