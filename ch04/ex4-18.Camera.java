// designing/fpij/Camera.java

@SuppressWarnings("unchecked")
public class Camera {
  private Function<Color, Color> filter;

  public Color capture(final Color inputColor) {
      final Color processedColor = filter.apply(inputColor);
      //... more processing of color...
      return processedColor;
  }

  //... other functions that use the filter ...
}
