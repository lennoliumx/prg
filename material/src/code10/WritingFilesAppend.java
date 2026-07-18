void main() throws IOException {
  Path outputFile = Paths.get("./output.txt");
  try (PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(
          new FileOutputStream(outputFile.toFile(), true), // true to append
          StandardCharsets.UTF_8 // Set encoding
  )))) {
    writer.print("Hello ");
    writer.println("World!");
    for (int i = 0; i < 10; i++) {
      writer.printf("%d² = %d%n", i, i * i);
    }
  }
}