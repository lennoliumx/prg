package code13;

import java.util.Scanner;

public class Enums2 {

  public static void main(String[] args) {
//        Icecream someScoop = Icecream.AMARENA;
//        System.out.println("Mein Eis hat den Geschmack " + someScoop);

    Icecream[] serving = {Icecream.STRAWBERRY, Icecream.VANILLA, Icecream.PISTACHE};

    System.out.print("Mein Eis besteht aus ");
    for (Icecream scoop : serving) {
      System.out.print(scoop + " ");
    }

    System.out.println();
    System.out.print("Es gibt folgende Sorten: ");
    Icecream[] allValues = Icecream.values();
    for (Icecream scoop : allValues) {
      System.out.print(scoop + " ");
    }
    System.out.println();

    Scanner scanner = new Scanner(System.in);

    System.out.print("Was ist Deine Lieblingssorte? ");
    String favorite = scanner.next().toUpperCase();
    Icecream favoriteScoop = Icecream.valueOf(favorite);
    boolean found = false;
    for (Icecream icecream : serving) {
      if (icecream == favoriteScoop) {
        found = true;
        break;
      }
    }
    if (found) {
      System.out.println("Super, dann ist Deine Lieblingssorte ja dabei.");
    } else {
      System.out.println("Pech gehabt!");
    }
    scanner.close();
  }
}
