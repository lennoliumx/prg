package code12.a_calendar;

import java.util.Scanner;

public class Calendar {

  public static String[] createAppointments() {
    String appointments[] = new String[24];
    for (int hour = 0; hour < appointments.length; hour++) {
      appointments[hour] = "";
    }
    return appointments;
  }


  public static void neuerEintrag(Scanner scanner, String[] appointments) {
    System.out.print("Wieviel Uhr? ");
    int hourInput = scanner.nextInt();
    if (hourInput < 0 || hourInput >= appointments.length) {
      System.out.println("keine gültige Stunde");
    } else {
      System.out.print("Termin? ");
      String appointment = scanner.next();
      appointments[hourInput] = appointment;
    }
  }

  public static void print(String[] appointments) {
    for (int hour = 0; hour < appointments.length; hour++) {
      System.out.printf("%2dh: %s%n", hour, appointments[hour]);
    }
    System.out.println("------------");
  }

  public static void printMenu() {
    System.out.println("1 = Neuer Eintrag");
    System.out.println("2 = Termine ausgeben");
    System.out.println("3 = Beenden");
  }


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    scanner.useDelimiter("\n");

    // Hauptschleife
    String[] appointments = createAppointments();
    boolean done = false;
    while (!done) {
      printMenu();
      int choice = scanner.nextInt();
      switch (choice) {
        case 1 -> neuerEintrag(scanner, appointments);
        case 2 -> print(appointments);
        case 3 -> done = true;
        default -> System.out.println("Eingabefehler");
      }
    }
    scanner.close();
  }

}
