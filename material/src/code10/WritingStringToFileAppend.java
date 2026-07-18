void main() throws IOException, InterruptedException {
  String output = "This awesome string will be written to a file.";
  output += "\n";
  output += "This appears on a new line\n";
  for (int i = 10; i >= 0; i--) {
    output += "Countdown " + i + "\n";
  }

  Path path = Paths.get("./output.txt");
  Files.writeString(path, output,
          StandardOpenOption.CREATE, StandardOpenOption.APPEND); // creating file if not exists, otherwise appending
}