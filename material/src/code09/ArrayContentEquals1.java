void main() {
  //             i 0  1
  int[] valuesA = {1, 2};
  int[] valuesB = {1, 2};
  System.out.println(Arrays.toString(valuesA));
  System.out.println(Arrays.toString(valuesB));

  // Array-Inhalt vergleichen
  boolean arraysAreEqual = true;
  if (valuesA.length != valuesB.length) {
    arraysAreEqual = false;
  } else {
    // jeden Platz vergleichen
    for (int i = 0; i < valuesA.length; i++) {
      if (valuesA[i] != valuesB[i]) {
        arraysAreEqual = false;
        break;
      }
    }
  }
  System.out.println(arraysAreEqual ?
          "Arrays sind gleich" : "Arrays sind ungleich");
}
