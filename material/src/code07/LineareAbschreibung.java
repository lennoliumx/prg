void main() {
  // Eingabe
  Scanner scanner = new Scanner(System.in);
  System.out.print("Anschaffungskosten: ");
  double anschaffungskosten = scanner.nextDouble();
  System.out.print("Restwert: ");
  double restwert = scanner.nextDouble();
  System.out.print("Nutzungsdauer: ");
  double nutzungsdauer = scanner.nextDouble();
  //Verarbeitung
  double abschreibungswert = lineareAbschreibung(
          anschaffungskosten, restwert, nutzungsdauer);
  System.out.printf("Abschreibungswert: %6.2f", abschreibungswert);
}

double lineareAbschreibung(double anschaffungskoten, double restwert,
                           double nutzungsdauer) {
  double result = (anschaffungskoten - restwert) / nutzungsdauer;
  return result;
}

