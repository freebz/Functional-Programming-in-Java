// applying/fpij/StockUtil.java

public class StockUtil {
  public static StockInfo getPrice(final String ticker) {
    return new StockInfo(ticker, YahooFinance.getPrice(ticker));
  }
  //...
}
