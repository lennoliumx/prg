void main() {
  //                 01234567
  String giraffen = "GIRAFFEN";

  boolean contains = giraffen.contains("AFFEN");
  System.out.println("contains: " + contains);

  boolean startsWith = giraffen.startsWith("gira");
  System.out.println("startsWith :" + startsWith);

  boolean endsWith = giraffen.endsWith("GIRAFFEN");
  System.out.println("endsWith: " + endsWith);

  int indexOfA = giraffen.indexOf("A");
  System.out.println("indexOfA: " + indexOfA);

  int indexOfZ = giraffen.indexOf("Z");
  System.out.println("indexOfZ: " + indexOfZ);

  int indexOfAffen = giraffen.indexOf("AFFEN");
  System.out.println("indexOfAffen: " + indexOfAffen);
}
