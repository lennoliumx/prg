void main() {
  int nrOfCookies = 20;
  int nrOfPersons = 3;
  int nrOfCookiesPerPerson = nrOfCookies / nrOfPersons;
  System.out.print("Cookies per person: " + nrOfCookiesPerPerson);
  int restCookies = nrOfCookies % nrOfPersons;
  System.out.println(", Rest: " + restCookies);
  double result1 = nrOfCookies / nrOfPersons;
  System.out.println("nrOfCookies exact (wrong!!!): " + result1);
  double result2 = (double) nrOfCookies / nrOfPersons;
  System.out.println("nrOfCookies exact: " + result2);
  System.out.println();

  // Hinweis: In den ersten vier Beispielen kann man die Klammer
  // hinter dem + auch weglassen, also z.B.
  // System.out.println("9 / 2 = " + 9 / 2);
  System.out.println("9 / 2 = " + (9 / 2));
  System.out.println("9.0 / 2 = " + (9.0 / 2));
  System.out.println("9 / 2.0 = " + (9 / 2.0));
  System.out.println("9.0 / 2.0 = " + (9.0 / 2.0));
  System.out.println("(double) 9 / 2 = " + ((double) 9 / 2));
}
