void main() {
  Scanner scanner = new Scanner(System.in);
  System.out.print("Array size? ");
  int size = scanner.nextInt();
  int[] squareNumbers = new int[size];
  for (int x = 0; x < squareNumbers.length; x++) {
    squareNumbers[x] = x * x;
  }
//		System.out.println(Arrays.toString(squareNumbers));

  for (int x = 0; x < squareNumbers.length; x++) {
    System.out.println(x + "² = " + squareNumbers[x]);
  }
}
