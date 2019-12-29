// designing/fpij/CalculateNAV.java

public class CalculateNAV {
  public BigDecimal computeStockWorth(final String ticker, final int shares) {
    return priceFinder.apply(ticker).multiply(BigDecimal.valueOf(shares));
  }

  //... other methods that use the priceFinder ...
}
