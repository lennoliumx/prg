void main() {
  String giraffen = "Hallo!";

  String toUpperCase = giraffen.toUpperCase();
  System.out.println("toUpperCase: " + toUpperCase);

  String toLowerCase = giraffen.toLowerCase();
  System.out.println("toLowerCase: " + toLowerCase);

  System.out.println();
  System.out.println("whiteSpaces:");
  String withWhiteSpaces = "   Hallo Welt!\n \t";
  System.out.println(withWhiteSpaces);
  String stripped = withWhiteSpaces.strip();
  System.out.println(stripped);
}

