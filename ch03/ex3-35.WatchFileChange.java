// compare/fpij/WatchFileChange.java

final WatchKey watchKey = watchService.poll(1, TimeUnit.MINUTES);

if(watchKey != null) {
  watchKey.pollEvents().stream().forEach(event ->
    System.out.println(event.context()));
}
