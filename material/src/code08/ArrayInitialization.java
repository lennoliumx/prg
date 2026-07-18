void main() {

  String[] appointments;

  //Compiler-Fehler: not initialized
//        appointments[0] = "Treffen";


  int[] numbers;
  numbers = new int[2];
  numbers[1] = 42;

  double[] moreNumbers = {1.0, -5.678};
  System.out.println(moreNumbers[1]);

  char[] letters = {'1', '2', '3'};
  //Compilerfehler: Array-Initializer not allowed here
//        letters = {'A', 'B', 'C'};

  //Aber so geht's:
  letters = new char[]{'A', 'B', 'C'};
  //und auch so
  letters = new char[2];
  letters[0] = 'a';
  letters[1] = 'b';
}