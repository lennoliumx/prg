void main() {
  // erste for-Schleife lesen: exponent durchläuft die Werte 2 bis 4
  for (int exponent = 2; exponent < 5; exponent++) {
    System.out.printf("Wir rechnen jetzt \"hoch %d\":%n", exponent);
    // zweite for-Schleife lesen: basis durchläuft Werte von 0 bis 10
    for (int basis = 0; basis <= 10; basis++) {
      // Math.pow liefert einen double-Wert zurück.
      // Da wir hier aber nur mit int-Werten rechnen,
      // können wir mit %.0f die Nachkommastellen abschneiden
      // (.0 -> 0 Stellen hinter dem Komma)
      System.out.printf("%d hoch %d ist %.0f%n",
              basis, exponent, Math.pow(basis, exponent));
    }
  }

  // Weiteres Beispiel für verschachtelte Schleifen
//        for (int x = 0; x < 3; x++) {
//            System.out.println("Ich zähle jetzt von 0 bis " + x);
//            for (int y = 0; y <= x; y++) {
//                System.out.println(y);
//            }
//        }

//		int x = 0;
//		while (x < 10) {
//			System.out.println("Ich zähle jetzt von 0 bis " + x);
//			int y = 0;
//			while (y <= x) {
//				System.out.println(y);
//				y++;
//			}
//			x++;
//		}

}
