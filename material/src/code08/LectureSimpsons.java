void main() {
  //                      0        1        2       3       4
  String[] simpsons = {"Homer", "Marge", "Lisa", "Bart", "Maggie"};
  System.out.println(simpsons.length);
  System.out.println(simpsons[0]);
//        System.out.println(simpsons[4]);
  System.out.println(simpsons[simpsons.length - 1]);

  System.out.println(Arrays.toString(simpsons));
  System.out.println();

  // Die Simpsons sind:
  // - Homer
  // - Marge
  // :
  System.out.println("<ol>");
  for (int i = 0; i < simpsons.length; i++) {
    System.out.println("    <li>" + simpsons[i] + "</li>");
  }
  System.out.println("</ol>");
}
