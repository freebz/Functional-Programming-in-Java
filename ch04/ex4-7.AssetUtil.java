// designing/fpij/AssetUtil.java

public static int totalStockValues(final List<Asset> assets) {
  return assets.stream()
               .mapToInt(asset ->
	          asset.getType() == AssetType.STOCK ? asset.getValue() : 0)
               .sum();
}
