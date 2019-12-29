// applying/fpij/Stocks100.java

final BigDecimal HUNDRED = new BigDecimal("100");
System.out.println("Stock priced over $100 are " +
  Tickers.symbols
	 .stream()
	 .filter(symbol -> YahooFinance.getPrice(symbol).compareTo(HUNDRED) > 0)
	 .sorted()
	 .collect(joining(", ")));
