// lazy/fpij/Holder.java

public class Holder {
  private Supplier<Heavy> heavy = () -> createAndCacheHeavy();

  public Holder() {
    System.out.println("Holder created");
  }

  public Heavy getHeavy() {
    return heavy.get();
  }

  //...
}
