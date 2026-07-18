void main() throws IOException, InterruptedException {
  String output = """
          This awesome string will be written to a file.
          This is the next line.
          """;
  output += "\nThis also appears on a new line\n";
  for (int i = 10; i >= 0; i--) {
    output += "Countdown " + i + "\n";
  }
  System.out.println(output);
  Path path = Paths.get("./output.txt");
  Files.writeString(path, output);
}