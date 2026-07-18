void main() {
  int[] array = {17, 23, 42};
  System.out.println(array);

  System.out.println();

  for (int i = 0; i < array.length; i++) {
    System.out.println(i + ": " + array[i]);
  }

  System.out.println();

  System.out.println(Arrays.toString(array));
}
