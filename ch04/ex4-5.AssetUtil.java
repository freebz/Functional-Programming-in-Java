// designing/fpij/AssetUtil.java

public static int totalBondValues(final List<Asset> assets) {
  return assets.stream()
               .mapToInt(asset ->
		  assert.getType() == AssetType.BOND ? asset.getValue() : 0)
               .sum();
}
