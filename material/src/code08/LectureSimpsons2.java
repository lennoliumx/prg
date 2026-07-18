void main() {

//        String[] simpsons = new String[5];
//        simpsons[0] = "Homer";
//        simpsons[4] = "Maggie";
  //                    0        1         2       3       4
  String[] simpsons = {"Homer", "Marge", "Lisa", "Bart", "Maggie"};
  System.out.println(Arrays.toString(simpsons));
  System.out.println(simpsons[1]);
  System.out.println(simpsons.length);
  System.out.println(simpsons[simpsons.length - 1]);

  System.out.println();
  for (int index = 0; index < simpsons.length; index++) {
    System.out.println("Hallo " + simpsons[index]);
  }
  System.out.println();

  // wollen ausgabe = "[Homer, Marge, Lisa, Bart, Maggie]"
  String ausgabe = "[";
  for (int index = 0; index < simpsons.length; index++) {
    ausgabe = ausgabe + simpsons[index];
    if (index < simpsons.length - 1) {
      ausgabe += ", ";
    }
  }
  ausgabe = ausgabe + "]";
  System.out.println(ausgabe);
}