void main() {
  long l = 5_000_000_001L;
  System.out.println("long stellt die Zahl genau da: ");
  System.out.println(l);

  double d = l;
  System.out.println("Auch double bietet die nötige Genauigkeit (5.000000001E9 = 5.000000001*10^9 = 5_000_000_001):");
  System.out.println(d);

  float f = l;
  System.out.println("float hat nicht genug Stellen und rundet auf 5.0E9 = 5.0*10^9 = 5_000_000_000:");
  System.out.println(f);
}

