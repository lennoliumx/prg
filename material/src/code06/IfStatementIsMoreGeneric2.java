void main() {
  int alter = 19;

  if (alter < 12) {
    System.out.println("Kind");
  } else if (alter < 18) {
    System.out.println("Teenager");
  } else {
    System.out.println("Erwachsener");
  }

  // Mit Switch kann man nur auf konkrete Werte testen,
  // müsste das also so umsetzen:
  switch (alter) {
    case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 -> System.out.println("Kind");
    case 12, 13, 14, 15, 16, 17 -> System.out.println("Teenager");
    default -> System.out.println("Erwachsener");
  }
}
