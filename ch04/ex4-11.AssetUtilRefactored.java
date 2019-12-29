// designing/fpij/AssetUtilRefactored.java

System.out.println("Total of bonds: " +
  totalAssetValues(asset, asset -> asset.getType() == AssetType.BOND));

System.out.println("Total of stocks: " +
  totalAssetValues(asset, asset -> asset.getType() == AssetType.STOCK));
