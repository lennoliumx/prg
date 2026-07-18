void main() throws IOException {
  Path composersFile = Paths.get("./src/code10/composers.csv");
  Scanner fileScanner = new Scanner(composersFile, "UTF-8");

  // read line by line
  while (fileScanner.hasNextLine()) {
    String line = fileScanner.nextLine();
    // line contains a string like "1685;1750;Johann Sebastian Bach"

    // splitting line into parts by using ; as separator
    String[] lineParts = line.split(";");
    // now, lineParts.length == 3 and lineParts[0] == "1685", lineParts[1] == "1750",
    // and lineParts[2] == "Johann Sebastian Bach".
    // Note that all values are of type String, also the numbers.

    // using meaningful variables for the line parts and parsing String to int
    int birthYear = Integer.valueOf(lineParts[0]);
    int deathYear = Integer.valueOf(lineParts[1]);
    String composerName = lineParts[2];
    // calculating age
    int age = deathYear - birthYear;

    // building a message like "Johannes Sebastian Bach wurde 1685 geboren,
    //     starb 1750, wurde also etwa 65 Jahre alt."
    System.out.printf("%s wurde %d geboren, starb %d, " +
            "wurde also etwa %d Jahre alt.%n", composerName, birthYear, deathYear, age);
  }

  fileScanner.close();
}