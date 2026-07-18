void main() {
  int[] array = new int[4];
  int[] array2 = new int[4];
  array2[0] = 1;
  array2[1] = 2;
  array2[2] = 3;
  array2[3] = 10;
  array = array2;

  for (int i = 0; i < array.length; i++) {
    array[i]++;
  }
  System.out.println(Arrays.toString(array));
  System.out.println(Arrays.toString(array2));
}
