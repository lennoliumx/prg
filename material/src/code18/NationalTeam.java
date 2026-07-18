package code18;

public class NationalTeam {
  private String country;

  public NationalTeam(String country) {
    this.country = country;
  }

  public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  @Override
  public String toString() {
    return "NationalTeam: " + country + '\n';
  }
}
