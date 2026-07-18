package code13;

public class NumberConstants {
  public static void main(String[] args) {
    //direction NORTH WEST SOUTH EAST
    final int NORTH = 0;
    final int WEST = 1;
    final int SOUTH = 2;
    final int EAST = 3;

    // Nicht gut lesbar:
//        int[] directions = {0, 1, 1, 2, 2, 0, 2};

    // gut lesbar:
    int[] directions = {NORTH, WEST, WEST, SOUTH, SOUTH, NORTH, SOUTH};
    // problematic: This is also possible without compiler warnings/errors:
//        int[] directions = {42, -1, NORTH, WEST};

    for (int direction : directions) {
      switch (direction) {
        case NORTH -> System.out.print("^ ");
        case WEST -> System.out.print("< ");
        case SOUTH -> System.out.print("v ");
        case EAST -> System.out.print("> ");
      }
    }
    System.out.println();
  }
}
