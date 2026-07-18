void main() {
  //            id 0  1
  int[] valuesA = {1, 2};
  int[] valuesB = {1, 2};
  System.out.println(Arrays.toString(valuesA));
  System.out.println(Arrays.toString(valuesB));

  // Array-Inhalt vergleichen
  boolean arraysAreEqual = Arrays.equals(valuesA, valuesB);
  System.out.println(arraysAreEqual ?
          "Arrays sind gleich" : "Arrays sind ungleich");
}
 