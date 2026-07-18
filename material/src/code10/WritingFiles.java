void main() throws IOException {
  Path outputFile = Paths.get("./output.txt");
  try (PrintWriter writer = new PrintWriter(outputFile.toFile(), "UTF-8")) {
    writer.print("Hello ");
    writer.println("World!");
    for (int i = 0; i < 10; i++) {
      writer.printf("%d² = %d%n", i, i * i);
    }
  }
}