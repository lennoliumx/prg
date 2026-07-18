void main() {
  //      Index:   0  1  2  3  4  5
  int[] numbers = {2, 3, 5, 7, 9, 11};
  System.out.println("Länge: " + numbers.length);
  System.out.println("0: " + numbers[0]);
  System.out.println("1: " + numbers[1]);
  System.out.println("2: " + numbers[2]);
  System.out.println("3: " + numbers[3]);
  System.out.println("4: " + numbers[4]);
  System.out.println("5: " + numbers[5]);

  System.out.println("Letztes Element: " + numbers[numbers.length - 1]);

  System.out.println(Arrays.toString(numbers));

//        System.out.println("Zugriff auf Element mit Index 6");
//        int someIndex = 6;
//        System.out.println(numbers[someIndex]);
}
