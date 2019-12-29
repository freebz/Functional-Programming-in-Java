// resources/fpij/RodCutterTest.java

@Test
public void ConciseExceptionTest() {
  rodCutter.setPrices(prices);
  assertThrows(RodCutterException.class, () -> rodCutter.maxProfit(0));
}
