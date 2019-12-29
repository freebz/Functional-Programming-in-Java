// recur/fpij/Factorial.java

try {
  System.out.println(factorialRec(20000));
} catch(StackOverflowError ex) {
  System.out.println(ex);
}
