void main() {
  // Index              0  1  2  3  4
  int[] primeNumbers = {2, 3, 5, 7, 11};

  for (int i = 0; i < primeNumbers.length; i++) {
    System.out.println("Die " + (i + 1)
            + "-te Primzahl ist " + primeNumbers[i]);
  }

//        for (int primeNumber : primeNumbers) {
//            System.out.println("Die ???-te Primzahl ist " + primeNumber);
//        }

  // So bitte NICHT machen - dann lieber direkt mit for und int i...
//        int i = 0;
//        for (int primeNumber : primeNumbers) {
//            System.out.println("Die " + (i + 1)
//                    + "-te Primzahl ist " + primeNumber);
//            i++;
//        }
}

