package code23;

public class Recursion {

  static void iterativeMethod() {
    for (int i = 0; i < 10; i++) { // Schleife
      if (i % 2 == 0) { // if-Anweisung
        System.out.println(i); // Aufruf nicht-rekursiver Methode println
      }
    }
  }

  static void recursiveMethod(int n) {
    if (n > 10) {
      return;
    }
    System.out.println(n);
    recursiveMethod(n + 1);
  }

  static void indirectRecursionA(int n) {
    if (n > 10) {
      return;
    }
    System.out.println(n);
    indirectRecursionB(n + 1);
  }

  static void indirectRecursionB(int n) {
    if (n > 10) {
      return;
    }
    System.out.println(n);
    indirectRecursionA(n + 1);
  }

  public static void main(String[] args) {
    recursiveMethod(0);
  }
}
