void main() {
  String[][] monthsAndDays = new String[12][];

  monthsAndDays[0] = new String[31];
  monthsAndDays[1] = new String[28];
  monthsAndDays[2] = new String[31];
  monthsAndDays[3] = new String[30];
  monthsAndDays[4] = new String[31];
  monthsAndDays[5] = new String[30];
  monthsAndDays[6] = new String[31];
  monthsAndDays[7] = new String[31];
  monthsAndDays[8] = new String[30];
  monthsAndDays[9] = new String[31];
  monthsAndDays[10] = new String[30];
  monthsAndDays[11] = new String[31];

  // kürzer:
//        for (int month = 0; month < monthsAndDays.length; month++) {
//            switch (month + 1) { // umgerechnet: 0. Monat -> 1 (Januar)
//                case 1, 3, 5, 7, 8, 10, 12 -> monthsAndDays[month] = new String[31];
//                case 2 -> monthsAndDays[month] = new String[29];
//                case 4, 6, 9, 11 -> monthsAndDays[month] = new String[31];
//            }
//        }

  // Initialisierung
  for (int month = 0; month < monthsAndDays.length; month++) {
    String[] days = monthsAndDays[month];
    for (int day = 0; day < days.length; day++) {
      days[day] = "";
    }
  }

  monthsAndDays[0][2] = "3.1.: Bin immer noch müde.";
  monthsAndDays[0][12] = "13.1.: Arzttermin";

  monthsAndDays[1][0] = "1.2.: Der neue Monat geht los";
  monthsAndDays[1][1] = "2.2.: Freunde treffen";
  monthsAndDays[1][27] = "28.2.: Der Februar ist fast vorbei";
  //monthsAndDays[3][30] = "31.4.: Der Tag, den es nicht gibt";

  // Ausgabe eines Monats
  int month = 1;
  for (int day = 0; day < monthsAndDays[month].length; day++) {
    System.out.println((day + 1) + " - " + monthsAndDays[month][day]);
  }

  System.out.println();
}