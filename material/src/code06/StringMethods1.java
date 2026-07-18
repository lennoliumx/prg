void main() {
  //                 01234567
  String giraffen = "GIRAFFEN";

  int length = giraffen.length();
  System.out.println("length: " + length);

  boolean isEmpty = giraffen.isEmpty();
  System.out.println("isEmpty: " + isEmpty);

  char someChar = giraffen.charAt(1);
  System.out.println("someChar: " + someChar);
//        someChar = giraffen.charAt(13);

  String substring = giraffen.substring(3);
  System.out.println("substring: " + substring);

  substring = giraffen.substring(3, 7);
  System.out.println("substring: " + substring);
//        substring = giraffen.substring(3, 17);

  System.out.println("equals(): " + giraffen.equals("GIRAFFEN"));
}
