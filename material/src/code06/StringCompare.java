void main(String[] args) {
  String s1 = "GIRAFFEN";
  String s2 = new String(new char[]{'G', 'I', 'R', 'A', 'F', 'F', 'E', 'N'});
  // Diese Art, einen String zu erzeugen (s2), bitte NICHT verwenden. Ist nur für dieses Beispiel!

  // Beide String sind gleich:
  System.out.println(s1);
  System.out.println(s2);
  System.out.println();

  // Aber nur der Vergleich mit equals funktioniert richtig!
  System.out.println("s1 == s2      ergibt " + (s1 == s2));
  System.out.println("s1.equals(s2) ergibt " + s1.equals(s2));
}