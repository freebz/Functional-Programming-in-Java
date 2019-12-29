// applying/fpij/StockUtil.java

public static StockInfo pickHigh(
  final StockInfo stockInfo1, final StockInfo stockInfo2) {

  return stockInfo1.price.compareTo(stockInfo2.price) > 0 ? stockInfo1 : stockInfo2;
}
