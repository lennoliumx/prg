package code17.wc;

public enum Rolle {
  ANALYST("Analyst"),
  ASSISTANT_COACH("Assistant Coach"),
  ASSOCIATION_LEADERSHIP("Association Leadership"),
  EQUIPMENT_KIT("Equipment/Kit"),
  FITNESS_PERFORMANCE_COACH("Fitness/Performance Coach"),
  GOALKEEPING_COACH("Goalkeeping Coach"),
  HEAD_COACH("Head Coach"),
  MEDIA_COMMUNICATIONS("Media/Communications"),
  MEDICAL_PHYSIO("Medical/Physio"),
  OTHER_STAFF("Other Staff"),
  SECURITY("Security"),
  TEAM_MANAGER_ADMINISTRATION("Team Manager/Administration");

  private final String label;

  Rolle(String label) {
    this.label = label;
  }

  public String getLabel() {
    return label;
  }

  public static Rolle fromLabel(String label) {
    for (Rolle rolle : values()) {
      if (rolle.label.equalsIgnoreCase(label)) {
        return rolle;
      }
    }
    throw new IllegalArgumentException("Unknown role: " + label);
  }
}
