void main() {
  int[] numbers = {1, 5, 17};
  System.out.println(numbers[1]);
  System.out.println();

  int[][] coordinates = {
          {1, 0}, {5, 7}, {13, 8}
  };
  for (int i = 0; i < coordinates.length; i++) {
    System.out.println("(" + coordinates[i][0] + ", " + coordinates[i][1] + ")");
  }
  ;
  System.out.println();
//        System.out.println(coordinates.length);
//        System.out.println(coordinates[1][0] + ", " + coordinates[1][1]);
//        System.out.println(coordinates[1].length);

  int[][] otherCoordinates = new int[10][2];
  otherCoordinates[0][0] = 5;
  otherCoordinates[0][1] = 3;
  for (int i = 0; i < otherCoordinates.length; i++) {
    System.out.println(Arrays.toString(otherCoordinates[i]));
  }
}