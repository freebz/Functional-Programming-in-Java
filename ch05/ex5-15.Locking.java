// resources/fpij/Locking.java

public void doOp2() {
  runLocked(lock, () -> {/*...critical code ... */});
}
public void doOp3() {
  runLocked(lock, () -> {/*...critical code ... */});
}
public void doOp4() {
  runLocked(lock, () -> {/*...critical code ... */});
}
