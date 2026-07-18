void main() {
  // Eingabewerte
  double fixkosten = 50000.0;
  double verkaufspreis = 25.0;
  double variableKosten = 15.0;

  // Berechnungen
  double deckungsbeitragProStueck = verkaufspreis - variableKosten;
  double breakEvenMenge = fixkosten / deckungsbeitragProStueck;
  double breakEvenUmsatz = breakEvenMenge * verkaufspreis;

  // Ausgabe
  System.out.println("Deckungsbeitrag pro Stück: " + deckungsbeitragProStueck);
  System.out.println("Break-Even-Menge: " + breakEvenMenge);
  System.out.println("Break-Even-Umsatz: " + breakEvenUmsatz);
}
