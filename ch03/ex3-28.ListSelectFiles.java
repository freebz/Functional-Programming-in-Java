// compare/fpij/ListSelectFiles.java

    final String[] files =
      new File("fpij").list(new java.io.FilenameFilter() {
        public boolean accept(final File dir, final String name) {
          return name.endsWith(".java");
        }
      });
System.out.println(files);
