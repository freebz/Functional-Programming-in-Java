// compare/fpij/WatchFileChange.java

final Path path = Paths.get(".");
final WatchService watchService = path.getFileSystem().newWatchService();

path.register(watchService, StandardWatchEventKinds.ENTRY_MODIFY);

System.out.println("Report any file changed within next 1 minutes...");
