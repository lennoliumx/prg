void main() {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Wie alt bist Du? ");
  int alter = scanner.nextInt();

  boolean darfWaehlen = false;

  if (alter >= 18) {
    System.out.println("Du bist volljährig.");
    System.out.println("Let's party!");
    darfWaehlen = true;
  } else {
    System.out.println("Du bist noch nicht volljährig.");
  }
  System.out.println(darfWaehlen);

  scanner.close();
}

