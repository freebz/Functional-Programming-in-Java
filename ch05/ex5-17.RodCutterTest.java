// resources/fpij/RodCutterTest.java

@Test(expected = RodCutterException.class)
public void VerboseExceptionTest() {
  rodCutter.setPrices(prices);
  rodCutter.maxProfit(0);
}
