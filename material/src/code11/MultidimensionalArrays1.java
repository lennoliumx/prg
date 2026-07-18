void main() {
  String[][] appointments;

  // Compiler-Fehler: Arrays nicht initialisiert
//		System.out.println(appointments[1]);
//		System.out.println(appointments[1][5]);

  appointments = new String[31][24];

  appointments[1][12] = "Mittagessen";
  System.out.println(appointments[1][12]);

  // Andere Plätze sind mit null initialisiert (default-Wert bei Strings):
  System.out.println(appointments[0][0]);

  // Fehler zur Laufzeit beim Zugriff auf ungültige Positionen:
//		System.out.println(appointments[32][12]);
  System.out.println(appointments[14][30]);
}