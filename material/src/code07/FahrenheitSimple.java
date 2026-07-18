void main() {
  int detroitF = 68;
  int chicagoF = 58;
  int atlantaF = 81;

  double detroitC = (detroitF - 32) * 5.0 / 9.0;
  double chicagoC = (chicagoF - 32) * 5.0 / 9.0;
  double atlantaC = (atlantaF - 32) * 5.0 / 9.0;

  System.out.printf("detroit: = %d F / %.1f C%n", detroitF, detroitC);
  System.out.printf("chicago: = %d F / %.1f C%n", chicagoF, chicagoC);
  System.out.printf("atlanta = %d F / %.1f C%n", atlantaF, atlantaC);
}

