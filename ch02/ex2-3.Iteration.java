// collections/fpij/Iteration.java

friends.forEach(new Consumer<String>() {
  public void accept(final String name) {
    System.out.println(name);
  }
});
