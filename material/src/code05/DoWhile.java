void main() {
  Scanner scanner = new Scanner(System.in);

  int input;
  do {
    System.out.println("Bitte einen Wert zwischen 0 und 42 eingeben: ");
    input = scanner.nextInt();
  } while (input < 0 || input > 42);

  System.out.println("Ihre Eingabe: " + input);
  System.out.println("Danke!");

  scanner.close();
}
