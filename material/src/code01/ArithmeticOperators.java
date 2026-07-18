void main() {
  double radius = 4.2;
  double umfang = 2 * Math.PI * radius;
  System.out.println(umfang);
  System.out.printf("%.3f%n", umfang);
//        double umfangMitNurDreiNachkommastellen = Math.round(umfang * 1000) / 1000.0;
//        System.out.println(umfangMitNurDreiNachkommastellen);

  double note1 = 1.0;
  double note2 = 2.0;
  double note3 = 3.3;
  double durchschnitt = (note1 + note2 + note3) / 3;
  System.out.println(durchschnitt);

  int zahl = 21;
  System.out.println(zahl / 2);
  System.out.println(zahl % 2);
  System.out.printf("%d geteilt durch 2 ist %d Rest %d%n", zahl, zahl / 2, zahl % 2);
}
