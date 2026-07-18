package code20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Exceptions5a {

  private static void printFirst100Chars(String fileName) throws IOException {
    String content = Files.readString(Paths.get(fileName));

    if (content.length() > 100) {
      System.out.print(content.substring(0, 100) + "...");
    } else {
      System.out.println(content);
    }
  }

  public static void main(String[] args) throws IOException {
    // printFirst100Chars wirft jetzt eine NullPointerException
    // Diese ist eine unchecked exception (erbt von RuntimeException) und
    // muss nicht behandelt werden
    printFirst100Chars(null);
  }
}
