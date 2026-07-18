void main() {
  int[] array1 = {42, 43, 44};
  int[] array2 = array1;
  System.out.println("array1: " + Arrays.toString(array1));
  System.out.println("array2: " + Arrays.toString(array2));
  array2[1] = 0;
  //array1[0] = -1;
  System.out.println("array1: " + Arrays.toString(array1));
  System.out.println("array2: " + Arrays.toString(array2));

//        int n1 = 42;
//        int n2 = n1;
//        System.out.println("n1: " + n1);
//        System.out.println("n2: " + n2);
//        n2 = 0;
//        System.out.println("n1: " + n1);
//        System.out.println("n2: " + n2);
}
