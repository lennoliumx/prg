import java.sql.SQLOutput;

void main() {
  // Eingabe
  int jahr = 1940;
  boolean olympia = false;
  // Verarbeitung
  if ((jahr > 1896) && (jahr < 2026) && (jahr % 4 == 0)) {
    switch (jahr) {
      case 1940 -> olympia = false;
      case 1944 -> olympia = false;
      case 1916 -> olympia = false;
      case 2020 -> olympia = false;
      default -> olympia = true;
    }
  } else if (jahr == 2021) {
    olympia = true;
  }

  System.out.println("Olympische Sommerspiele? " + olympia);
  // Ausgabe
}