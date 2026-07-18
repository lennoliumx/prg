void main() {
  int[] originalValues = {4, 2, 1, 3, 6, 5};
  int[] sortedValues = new int[originalValues.length];
  for (int i = 0; i < originalValues.length; i++) {
    sortedValues[i] = originalValues[i];
  }

  System.out.println("Vor Sortierung:");
  System.out.println("originalValues: " + Arrays.toString(originalValues));
  System.out.println("sortedValues:   " + Arrays.toString(sortedValues));

  Arrays.sort(sortedValues);

  System.out.println("Nach Sortierung:");
  System.out.println("originalValues: " + Arrays.toString(originalValues));
  System.out.println("sortedValues:   " + Arrays.toString(sortedValues));
}


