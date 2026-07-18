void main() {
  int intNumber;
  long longNumber;

  longNumber = 42L;
  System.out.println(longNumber);
  intNumber = Math.toIntExact(longNumber);
  System.out.println(intNumber);

  longNumber = 2_500_000_000L;
  System.out.println(longNumber);
  intNumber = Math.toIntExact(longNumber);
  System.out.println(intNumber);
}

