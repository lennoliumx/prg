// Hier im Beispiel geht es um die Stelligkeiten von float und double.
// Die Verwendung von Variablen nehmen Sie einfach zur Kenntnis.
// Das müssen Sie jetzt noch nicht im Detail verstehen.
void main() {
  // insgesamt 8 Stellen (eine vor dem Komma, 7 danach), das klappt noch:
  float number1 = 1.0000001f;
  System.out.println("number1: " + number1);

  // insgesamt 9 Stellen (eine vor dem Komma, 8 danach),
  // hier reicht die Genauigkeit von float nicht mehr aus.
  // Die Zahl wird auf 1.0 gerundet.
  float number2 = 1.00000001f;
  System.out.println("number2: " + number2);

  // double bietet genug Genauigkeit für
  // insgesamt 9 Stellen (eine vor dem Komma, 8 danach).
  double number3 = 1.00000001;
  System.out.println("number3: " + number3);

  // Bei double ist dann allerdings auch bei insgesamt 17 Stellen Schluss!
  double number4 = 1.0000000000000001;
  System.out.println("number4: " + number4);

  // Vorsicht: Beim Rechnen mit Gleitkommazahlen kann
  // Genauigkeit verloren gehen
  float number5 = 1.0f;
  // gültige float-Zahl, nur eine Stelle:
  System.out.println("number5: " + number5);
  float number6 = 0.00000001f;
  // gültige float-Zahl, da nur eine Stelle (1 * 10 hoch -8)
  System.out.println("number6: " + number6);
  float sum = number5 + number6;
  // hier wird jetzt gerundet
  System.out.println("Summe: " + sum);
}
