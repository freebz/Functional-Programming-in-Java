// resources/fpij/Locking.java

public class Locking {
  Lock lock = new ReentrantLock(); //or mock

  protected void setLock(final Lock mock) {
    lock = mock;
  }

  public void doOp1() {
    lock.lock();
    try {
      //...critical code...
    } finally {
      lock.unlock();
    }
  }
  //...
}
