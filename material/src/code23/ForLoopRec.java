package code23;

public class ForLoopRec {

  static void printSequenceIt(int from, int to) {
    for (int i = from; i <= to; i++) {
      System.out.println(i);
    }
  }

  static void printSequenceRec(int from, int to) {
    System.out.println(from);
    if (from == to) {
      return;
    }
    printSequenceRec(from + 1, to);
  }

  public static void main(String[] args) {
    printSequenceIt(1, 10);
    System.out.println();
    printSequenceRec(1, 10);
  }
}
