// Hier im Beispiel geht es um die Ungenauigkeit der Darstellung von 0.1
// Die Verwendung von Variablen und Operationen nehmen Sie einfach zur Kenntnis.
// Das müssen Sie jetzt noch nicht im Detail verstehen.
void main(String[] args) {
  System.out.println(0.1 + 0.1 + 0.1 + 0.1 + 0.1
          + 0.1 + 0.1 + 0.1 + 0.1 + 0.1);
  System.out.println();

  double tenCent = 0.1;
  System.out.println(tenCent);

  double aEuro = tenCent + tenCent + tenCent + tenCent + tenCent
          + tenCent + tenCent + tenCent + tenCent + tenCent;
  System.out.println(aEuro);


  long longRound = Math.round(aEuro);
  long longCast = (long) aEuro;
  System.out.println("Int Euro:" + longRound);


  double tenEuro = aEuro + aEuro + aEuro + aEuro + aEuro
          + aEuro + aEuro + aEuro + aEuro + aEuro;
  System.out.println(tenEuro);
}