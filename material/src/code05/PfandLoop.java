void main() {
  String eingabe = "MIMEDK";
  final char MEHRWEGFLASCHE = 'M';
  final char EINWEGFLASCHE = 'E';
  final char DOSE = 'D';
  final char KASTEN = 'K';
  double betrag = 0.0;
  for (int index = 0; index < eingabe.length(); index++) {
    char c = eingabe.charAt(index);
    double result = 0.0;
    switch (c) {
      case MEHRWEGFLASCHE -> result = 0.08;
      case EINWEGFLASCHE -> result = 0.08;
      case DOSE -> result = 0.25;
      case KASTEN -> result = 3;
      default -> System.out.println("Unbekanntes Zeichen: " + c);
    }
    betrag += result;
  }
  System.out.println(betrag);
}
