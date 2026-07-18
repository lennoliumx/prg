void main(String[] args) {
  int[] numbersToDouble = {1, 2, 3, 4};

  System.out.println(Arrays.toString(numbersToDouble));
  for (int i = 0; i < numbersToDouble.length; i++) {
    numbersToDouble[i] *= 2;
    // äquivalent: numbersToDouble[i] = numbersToDouble[i] * 2;
  }
  System.out.println(Arrays.toString(numbersToDouble));


  System.out.println("Jetzt versuchen wie es mit einer for-each-Schleife:");
  int[] numbersToDouble2 = {1, 2, 3, 4};

  System.out.println(Arrays.toString(numbersToDouble2));
  for (int numberToDouble : numbersToDouble2) {
    numberToDouble *= 2;
//            System.out.println("in der Schleife: " + numberToDouble);
  }
  System.out.println(Arrays.toString(numbersToDouble2));
}
