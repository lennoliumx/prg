package code07;

public class RandomLecture2 {

  public static void main(String[] args) {
//        for (int i = 0; i < 5; i++) {
//            double random = Math.random();
//            System.out.println(random);
//        }

//        int[] werte = new int[7]; // Zugriff auf werte[0] bis werte[6]
//        for (int i = 0; i < 1000; i++) {
//            int wuerfelWert = (int) (Math.random() * 6 + 1);
//            werte[wuerfelWert]++;
//            System.out.println(wuerfelWert);
//        }
//        System.out.println(Arrays.toString(werte));

    for (int i = 0; i < 1000; i++) {
      int randomInt = (int) (Math.random() * 2);
      System.out.println(randomInt);
    }

//        int randomInt = (int) (Math.random() * 2);
//        boolean kino = randomInt == 1;
    boolean kino = Math.random() >= 0.5;

    if (kino) {
      System.out.println("Ich gehe ins Kino");
    } else {
      System.out.println("Ich gehe nichts ins Kino");
    }
  }
}
