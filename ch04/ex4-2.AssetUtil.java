// designing/fpij/AssetUtil.java

public static int totalAssetValues(final List<Asset> assets) {
  return assets.stream()
               .mapToInt(Asset::getValue)
               .sum();
}
