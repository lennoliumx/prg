void main() {
  boolean eprKlausurBestanden = true;
  boolean eprUebungsScheinBestanden = true;
  boolean eprModulBestanden = eprKlausurBestanden && eprUebungsScheinBestanden;
  System.out.println("EPR-Modul bestanden: " + eprModulBestanden);

  boolean esGibtEis = false;
  boolean esRegnet = false;
  System.out.println("Ich habe gute Laune: " + (esGibtEis || !esRegnet));
}

