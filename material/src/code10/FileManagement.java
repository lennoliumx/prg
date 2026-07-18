// Vor dem Ausführen sicherstellen, dass "output.txt" existiert, aber kein
// Unterverzeichnis "subdirectory"
void main() throws IOException {
  Path output = Paths.get("output.txt");
  Path output2 = Paths.get("output2.txt");
  System.out.println(Files.exists(output));
  System.out.println(Files.exists(output2));
  Files.copy(output, output2);
  Files.move(output, output2, StandardCopyOption.REPLACE_EXISTING);
  Files.delete(output2);
  Files.deleteIfExists(Paths.get("somefile.txt"));
  Files.createDirectory(Paths.get("subdirectory"));
  Files.createDirectories(Paths.get("subdirectory/sub"));
}

