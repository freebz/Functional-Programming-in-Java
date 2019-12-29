// resources/fpij/RodCutterTest.java

@Test public void VerboseExceptionTest() {
  rodCutter.setPrices(prices);
  try {
    rodCutter.maxProfit(0);
    fail("Expected exception for zero length");
  } catch(RodCutterException ex) {
    assertTrue("expected", true);
  }
}
