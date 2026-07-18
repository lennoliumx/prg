void main() {
  int[] originalValues = {4, 2, 1, 3, 6, 5};
  int[] sortedValues = new int[originalValues.length];
  System.arraycopy(
          originalValues,
          0,
          sortedValues,
          0,
          originalValues.length
  );

  System.out.println("Vor Sortierung:");
  System.out.println("originalValues: " + Arrays.toString(originalValues));
  System.out.println("sortedValues:   " + Arrays.toString(sortedValues));

  Arrays.sort(sortedValues);

  System.out.println("Nach Sortierung:");
  System.out.println("originalValues: " + Arrays.toString(originalValues));
  System.out.println("sortedValues:   " + Arrays.toString(sortedValues));
}
