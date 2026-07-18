void main() {
  // Beispiel zur break, kein guter Code!
  int y;
  for (int x = 0; x < 4; x++) {
    y = 0;
    while (true) {
      System.out.println("(" + x + "," + y + ")");
      y++;
      if (y >= 3) {
        break;
      }
    }
  }
}

