// designing/fpij/AssetUtilRefactored.java

public static int totalAssetValues(final List<Asset> assets,
  final Predicate<Asset> assetSelector) {
  return asets.stream().filter(assetSelector).mapToInt(Asset::getValue).sum();
}
