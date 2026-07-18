void main() {

  // Recall: 2_147_483_647 is the maximal integer value

  int test = 2_000_000_000;
  // left association: so test * 2 is calculated first which leads to an integer overflow
  // Thus, the result becomes negative
  int result1 = test * 2 / 4;
  System.out.println(result1);

  // left association: so test / 4 is calculated, then the result is multiplied by two
  // All these operations stay in the integer value range
  int result2 = test / 4 * 2;
  System.out.println(result2);

  // Note that these two calculation would theoretically have the same issue
  // as the example above:
  //int result1 = test + 1_000_000_000 - 2_000_000_000;
  //int result2 = test - 2_000_000_000 + 1_000_000_000;
  // However, due to a compiler optimization called constant folding (see https://en.wikipedia.org/wiki/Constant_folding)
  // + 1_000_000_000 and - 2_000_000_000 are "folded" together. Thus, the resulting
  // code that is executed is the following for both statements:
  //int result = test - 1_000_000_000;
  // This calculation clearly stays within the integer value range.
}
