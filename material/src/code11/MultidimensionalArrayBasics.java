void main() {
  String[][] teams = {
          {"Peter", "Paul"},
          {"Anna", "Beate", "Emma"},
          {"Thomas", "Sabrina"}
  };

  System.out.println(teams[1][1]);
  System.out.println(teams.length);

  System.out.println(teams[0].length);
  System.out.println(teams[1].length);
  String[] secondTeam = teams[1];
  System.out.println("Zweites Team:");
  for (int i = 0; i < secondTeam.length; i++) {
    System.out.println(" - " + secondTeam[i]);
  }
  System.out.println();
  System.out.println("Zweites Team:");
  for (int i = 0; i < teams[1].length; i++) {
    System.out.println(" - " + teams[1][i]);
  }

  System.out.println();
  System.out.println("Alle Teams:");
  for (int i = 0; i < teams.length; i++) {
    System.out.println(" - Team " + i);
    for (int j = 0; j < teams[i].length; j++) {
      System.out.println("   - " + teams[i][j]);
    }
  }
}

