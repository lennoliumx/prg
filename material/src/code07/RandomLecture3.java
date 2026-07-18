package code07;

public class RandomLecture3 {

  public static void main(String[] args) {
    //                0        1        2        3       4
//        String[] names = {"Homer", "Marge", "Bart", "Lisa", "Maggie"};
//        for (int i = 1; i <= 10; i++) {
//            int randomIndex = (int) (Math.random() * 5);
//            System.out.println(names[randomIndex]);
//        }
//        String[] names = {"Kino", "Zu Hause", "Essen gehen"};
//        int randomIndex = (int) (Math.random() * names.length);
//        System.out.println(names[randomIndex]);

    if (Math.random() < 0.5) {
      System.out.println("Kino");
    } else {
      System.out.println("Bleibe zu Hause");
    }
  }
}
