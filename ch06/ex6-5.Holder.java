// lazy/fpij/Holder.java

private synchronized Heavy createAndCacheHeavy() {
  class HeavyFactory implements Supplier<Heavy> {
    private final Heavy heavyInstance = new Heavy();

    public Heavy get() { return heavyInstance; }
  }

  if(!HeavyFactory.class.isInstance(heavy)) {
    heavy = new HeavyFactory();
  }

  return heavy.get();
}
