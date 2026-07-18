void main() {
  int nr = 5;
  boolean test = true;
  char c = 'c';
  // Umwandeln mit String.valueOf
  String myString1 = String.valueOf(nr) + " " + String.valueOf(test) + " " + String.valueOf(c);
  System.out.println(myString1);

  String myString2 = nr + " " + test + " " + c;
  System.out.println(myString2);
  System.out.println();

  // Aufpassen
  System.out.println('J' + 'S'); // Ausgabe 157
  System.out.println("" + 'J' + 'S'); // Ausgabe JS
  System.out.println(String.valueOf('J') + 'S'); // Ausgabe JS
}
