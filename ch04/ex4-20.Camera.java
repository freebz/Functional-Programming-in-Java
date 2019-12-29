// designing/fpij/Camera.java

final Camera camera = new Camera();
final Consumer<String> printCaptured = (filterInfo) ->
  System.out.println(String.format("with s: %s", filterInfo,
    camera.capture(new Color(200, 100, 200))));
