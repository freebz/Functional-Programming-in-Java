// designing/fpij/CalculateNAVTest.java

public class CalculateNAVTest {
  @Test
  public void coputeStockWorth() {
    final CalculateNAV calculateNAV =
      new CalculateNav(ticker -> new BigDecimal("6.01"));

    BigDecimal expected = new BigDecimal("6010.00");
    assertEquals(0,
      calculateNAV.computeStockWorth("GOOG", 1000).compareTo(expected));
  }
  //...
}
