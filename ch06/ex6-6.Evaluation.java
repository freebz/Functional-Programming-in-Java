// lazy/fpij/Evaluation.java

public class Evaluation {
  public static boolean evaluate(final int value) {
    System.out.println("evaluating ..." + value);
    simulateTimeConsumingOp(2000);
    return value > 100;
  }
  //...
}
