package code13;

public class Enums1 {
  public static void main(String[] args) {
    Direction myDirection = Direction.NORTH;
    myDirection = Direction.WEST;
    // Fehler:
//        myDirection = 42;

    Direction[] directions = {Direction.NORTH, Direction.WEST,
            Direction.WEST, Direction.SOUTH, Direction.SOUTH,
            Direction.NORTH, Direction.SOUTH};
    // Fehler bei
//        Direction[] directions = {42, -1, Direction.NORTH, Direction.WEST};

    for (Direction direction : directions) {
      switch (direction) {
        case NORTH -> System.out.print("^ ");
        case WEST -> System.out.print("< ");
        case SOUTH -> System.out.print("v ");
        case EAST -> System.out.print("> ");
//                default -> System.out.println("? ");
      }
    }
    System.out.println();
  }
}
