void main() {
  String four = "4";
//        System.out.println(four + four);
  String sevenPointFive = "7.5";
  String nineHundredWithSpace = " 900";
  String notANumber = "A4";

  int i = Integer.parseInt(four);
  String result = four + four;
  System.out.println(i + i);

  String r = four + four;
  System.out.println(r);
  //        i = Integer.parseInt(sevenPointFive);
//        i = Integer.parseInt(nineHundredWithSpace);
  i = Integer.parseInt(notANumber);

  double d = Double.parseDouble(four);
  d = Double.parseDouble(sevenPointFive);
  //d = Double.parseDouble(notANumber);

  float f = Float.parseFloat(sevenPointFive);

//        boolean b = Boolean.parseBoolean("true");
//        System.out.println(b);
//        b = Boolean.parseBoolean("1");
//        System.out.println(b);
//        System.out.println(Boolean.parseBoolean("True"));
}
