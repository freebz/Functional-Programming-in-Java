// compare/fpij/IterateString.java

str.chars()
   .filter(ch -> Character.isDigit(ch))
   .forEach(ch -> printChar(ch));
