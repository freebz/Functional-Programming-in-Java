// designing/fpij/Camera.java

public void setFilters(final Function<Color, Color>... filters) {
  filter =
    Arrays.asList(filters).stream()
                          .reduce((filter, next) -> filter.compose(next))
                          .orElse(color -> color);
}

public Camera() { setFilters(); }
