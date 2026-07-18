void main() {
  int outerNumber = 1;
  {
    int innerNumber = 2;
//	   		int outerNumber = 2;
    System.out.println(outerNumber + innerNumber);
  }
//		innerNumber = 5;
  {
//		    System.out.println(outerNumber + innerNumber);
    double innerNumber = 3.0;
    System.out.println(outerNumber + innerNumber);
    outerNumber = 2;
//			double outerNumber = 5.0;
  }
  System.out.println(outerNumber);
}
