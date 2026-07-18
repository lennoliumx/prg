package code15.generator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class KennzeichenGenerator {

  private static final List<String> DISTRICTS = List.of(
          "B", "M", "HH", "K", "S", "F", "N", "HB", "H", "DD", "L", "E", "DO", "BO", "BI", "BN", "MS", "DU", "D", "W",
          "AC", "A", "AB", "AN", "AUR", "AW", "AZ", "BAD", "BAR", "BB", "BC", "BED", "BER", "BG", "BGL", "BN",
          "BOR", "BOT", "BRA", "BRB", "BS", "BT", "C", "CE", "CLP", "COC", "COE", "CUX", "CW", "DA", "DAN",
          "DEL", "DN", "E", "EF", "ER", "ES", "EU", "FDS", "FFB", "FN", "FR", "FS", "G", "GE", "GI", "GL", "GP",
          "GS", "GT", "GZ", "H", "HA", "HD", "HF", "HG", "HH", "HL", "HN", "HO", "HOL", "HOM", "HP", "HR", "HS",
          "IN", "IZ", "K", "KA", "KB", "KE", "KI", "KL", "KN", "KO", "KS", "L", "LA", "LB", "LD", "LG", "LI",
          "LM", "LU", "M", "MA", "MD", "ME", "MG", "MH", "MI", "MK", "MM", "MN", "MS", "MTK", "MZ", "N", "ND",
          "NE", "NEW", "NF", "NK", "NM", "NR", "NT", "NU", "OA", "OD", "OE", "OF", "OG", "OH", "OL", "OS",
          "P", "PA", "PB", "PF", "PI", "PL", "PS", "R", "RA", "RE", "REG", "RH", "RO", "ROS", "ROW", "RT",
          "RV", "S", "SB", "SE", "SHA", "SI", "SL", "SM", "SN", "SO", "SP", "SR", "STA", "STD", "SU", "SW",
          "TBB", "TF", "TR", "TS", "TÜ", "UE", "UL", "UN", "V", "VER", "W", "WAF", "WES", "WF", "WHV", "WI",
          "WN", "WOB", "WR", "WST", "WT", "WÜ", "WUG", "Z"
  );

  private static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final Random RANDOM = new Random();
  private static int COUNT = 1_000;

  public static void main(String[] args) throws IOException {
    Set<String> plates = new HashSet<>(COUNT);

    while (plates.size() < COUNT) {
      plates.add(randomPlate());
    }

    Files.write(Path.of("kennzeichen.txt"), plates);

    System.out.println("Created kennzeichen.txt with " + COUNT + " entries");
  }

  public static String randomPlate() {
    String district = DISTRICTS.get(RANDOM.nextInt(DISTRICTS.size()));
    String letters = randomLetters(1, 2);
    int number = RANDOM.nextInt(9999) + 1;
    return district + "-" + letters + "-" + number;
  }

  private static String randomLetters(int min, int max) {
    int len = RANDOM.nextInt(max - min + 1) + min;
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; i < len; i++) {
      sb.append(LETTERS.charAt(RANDOM.nextInt(LETTERS.length())));
    }
    return sb.toString();
  }
}