package code20.gettersetter;

/**
 * Beinhaltet PLZ und Ort einer Adresse. Die Klasse stellt im Konstruktor und
 * in den set-Methoden sicher, dass <br>
 * 1. die PLZ eine Zahl zwischen 0 und 99999 ist, <br>
 * 2. die Stadt weder null noch der leere String ist.
 */
public class Address {

  private int plz;
  private String city;

  public Address(int plz, String city) {
    if (plz < 0 || plz > 99999) {
      throw new IllegalArgumentException("wrong plz");
    }
    this.plz = plz;
    if (city == null) {
      throw new NullPointerException("city must not be null");
    }
    if (city.isEmpty()) {
      throw new IllegalArgumentException("city must not be empty");
    }
    this.city = city;
  }

  public int getPlz() {
    return plz;
  }

  public void setPlz(int plz) {
    if (plz < 0 || plz > 99999) {
      throw new IllegalArgumentException("wrong plz");
    }
    this.plz = plz;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    if (city == null) {
      throw new NullPointerException("city must not be null");
    }
    if (city.isEmpty()) {
      throw new IllegalArgumentException("city must not be empty");
    }
    this.city = city;
  }
}
