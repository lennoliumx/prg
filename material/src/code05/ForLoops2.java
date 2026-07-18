void main() {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i * i);
//        }

  for (double d = -1; d <= 1; d = d + 0.1) {
    System.out.printf("%5.1f%n", d);
//            System.out.println(d);
  }

  for (int i = 1; i <= 1024; i = 2 * i) {
    System.out.println(i);
  }

  // for (Initialisierung; Bedingung; Update) {
  //        Anweisung(en)
  // }

  for (String s = ""; s.length() < 10; s = s + "o") {
    System.out.println(s);
  }

  // Initialisierung
  // while (Bedingung) {
  //        Anweisung(en)
  //        Update
  // }

//        String s = "";
//        while (s.length() < 10) {
//            System.out.println(s);
//            s = s + "a";
//        }
//
}
