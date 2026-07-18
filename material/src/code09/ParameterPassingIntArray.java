void doSomething(int[] arrayParam) {
  arrayParam[1] = 11;
}

void main(String[] args) {
  int[] arrayMain = {42, 43};
  doSomething(arrayMain);
  System.out.println(Arrays.toString(arrayMain));
}

