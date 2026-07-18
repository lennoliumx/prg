package code17.gettersetter;

public class Address {

  private int plz;
  private String city;

  public Address() {
  }

  public int getPlz() {
    return this.plz;
  }

  public void setPlz(int plz) {
    if (plz < 0 || plz > 99999) {
      throw new IllegalArgumentException("wrong plz");
    }
    this.plz = plz;
  }

  public String getCity() {
    return this.city;
  }

  public void setCity(String city) {
    this.city = city;
  }
}
