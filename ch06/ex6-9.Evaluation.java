// lazy/fpij/Evaluation.java

public static void lazyEvaluator(
  final Supplier<Boolean> input1, final Supplier<Boolean> input2) {

  System.out.println("lazyEvaluator called...");
  System.out.println("accept?: " + (input1.get() && input2.get()));
}
