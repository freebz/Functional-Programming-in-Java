// introduction/fpij/DiscountFunctional.java

final BigDecimal totalOfDiscountedPrices =
  prices.stream()
        .filter(price -> price.compareTo(BigDecimal.valueOf(20)) > 0)
        .map(price -> price.multiply(BigDeciaml.valueOf(0.9)))
        .reduce(BigDeciaml.ZERO, BigDeciaml::add);

System.out.println("Total of discounted prices: " + totalOfDiscountedPrices);
