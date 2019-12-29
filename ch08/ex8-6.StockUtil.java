// applying/fpij/StockUtil.java

public static Predicate<StockInfo> isPriceLessThan(final int price) {
  return stockInfo -> stockInfo.price.compareTo(BigDecimal.valueOf(price)) < 0;
}
