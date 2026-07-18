void main() {
  // Index              0  1  2  3  4
  int[] primeNumbers = {2, 3, 5, 7, 11};

  for (int i = 0; i < primeNumbers.length; i++) {
    System.out.println(primeNumbers[i]);
  }

  System.out.println();

  for (int primeNumber : primeNumbers) {
    System.out.println(primeNumber);
  }

}
