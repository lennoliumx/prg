void main() {
  double randomDouble = Math.random();
  System.out.println(randomDouble);
  System.out.println(Math.random() * 10);
  for (int numberDraw = 0; numberDraw < 20; numberDraw++) {
    System.out.format("%3d ", (int) (Math.random() * 10));
  }
  System.out.println();
  for (int numberDraw = 0; numberDraw < 20; numberDraw++) {
    System.out.printf("%+3d ", (int) (Math.random() * 21) - 10);
  }
  System.out.println();
}
