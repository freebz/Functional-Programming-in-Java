// compare/fpij/IterateString.java

str.chars()
   .mapToObj(ch -> Character.valueOf((char)ch))
   .forEach(System.out::println);
