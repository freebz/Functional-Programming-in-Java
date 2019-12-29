// applying/fpij/PickStockImperativeClubbed.java

StockInfo highPriced = new StockInfo("", BigDecimal.ZERO);
final Predicate<StockInfo> isPriceLessThan500 = StockUtil.isPriceLessThan(500);

for(String symbol : Tickers.symbols) {
  StockInfo stockInfo = StockUtil.getPrice(symbol);

  if(isPriceLessThan500.test(stockInfo))
    highPriced = StockUtil.pickHigh(highPriced, stockInfo);
}
System.out.println("High priced under $500 is " + highPriced);
