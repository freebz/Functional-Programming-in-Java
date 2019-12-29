// resources/fpij/RodCutterTest.java

@Test public void VerboseExceptionTest() {
  rodCutter.setPrices(prices);
  try {
    rodCutter.maxProfit(0);
    fail("Expected exceptio for zero length");
  } catch(RodCutterException ex) {
    assertTrue("expected", true);
  }
}
@Test(expected = RodCutterException.class)
public void TerseExceptionTest() {
  rodCutter.setPrices(prices);
  rodCutter.maxProfit(0);
}
@Test
public void ConciseExceptionTest() {
  rodCutter.setPrices(prices);
  assertThrows(RodCutterException.class, () -> rodCutter.maxProfit(0));
}
