// recur/fpij/RodCutterBasic.java

public int maxProfit(final int length) {
  int profit = (length <= prices.size()) ? prices.get(length - 1) : 0;
  for(int i = 1; i < length; i++) {
    int priceWhenCut = maxProfit(i) + maxProfit(length - i);
    if(profit < priceWhenCut) profit = priceWhenCut;
  }

  return profit;
}
