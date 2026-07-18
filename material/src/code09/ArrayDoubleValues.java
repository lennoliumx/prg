void main() {
  int[] values = {1, 2, 3};
  int[] doubleValues = new int[values.length];

  for (int id = 0; id < doubleValues.length; id++) {
    doubleValues[id] = values[id] * 2;
  }
  for (int id = 0; id < doubleValues.length; id++) {
    System.out.println("Die Zahl " + values[id] + " ergibt verdoppelt "
            + doubleValues[id]);
  }
}
