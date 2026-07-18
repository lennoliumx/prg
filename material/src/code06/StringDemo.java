import java.sql.SQLOutput;

void main() {
  String eingabe = "      Ja     ";
  String normalized = eingabe.toUpperCase().strip();
  if (eingabe.toUpperCase().strip().equals("JA")) {
    System.out.println("Positiv");
  } else {
    System.out.println("Negativ");
  }

  // int start = 3;
  // int end = 9;
  // for (int i=start;i<end;i++) {
  //   System.out.print(eingabe.charAt(i));
  // }
}