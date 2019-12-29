// designing/fpij/CalculateNAV.java

final CalculateNAV calculateNav = new CalculateNav(YahooFinance::getPrice);

System.out.println(String.format("100 shares of Google worth: $%.2f",
  calculateNav.computeStockWorth("GOOG", 100)));
