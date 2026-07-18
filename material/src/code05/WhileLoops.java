void main() {
  for (int id = 0; id < 10; id++) {
    System.out.println("id: " + id);
  }

  {
    int id = 0;
    while (id < 10) {
      System.out.println("id: " + id);
      id++;
    }
  }
}
