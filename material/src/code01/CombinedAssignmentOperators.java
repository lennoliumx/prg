void main() {
  // verschiedene Berechnungen
  int someNumber = 42;
  someNumber += 1; // someNumber = someNumber + 1;
  System.out.println(someNumber);
  someNumber -= 3;
  System.out.println(someNumber);
  System.out.println();

  // rechte Seite kann auch Variable sein
  int number = 9;
  int divisor = 2;
  // Division mit Rest
  number /= divisor; // number = number / divisor
  System.out.println(number);
  System.out.println();

  // += funktioniert auch bei Strings
  String s = "Hallo";
  s += " Welt!"; // s = s + " Welt!"
  System.out.println(s); // Hallo Welt!
}
