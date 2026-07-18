package code12.g_toString;

public class Address {

  private String name;
  private String street;
  private String city;
  private int postcode;
  private boolean favorite;

  public Address(String name, String street, String city, int postcode, boolean favorite) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.postcode = postcode;
    this.favorite = favorite;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public String getStreet() {
    return street;
  }

  public int getPostcode() {
    return postcode;
  }

  public String getCity() {
    return city;
  }

  public void setAddress(String street, int postcode, String city) {
    this.street = street;
    this.postcode = postcode;
    this.city = city;
  }

  public String toString() {
    String result = String.format("%s wohnt in %s, %d %s", this.name, this.street, this.postcode, this.city);
    if (this.favorite) {
      result = result + (" (Favoriteneintrag)");
    }
    return result;
  }

  public String postCodeAndCity() {
    String formatted = this.postcode + " " + this.city;
    return formatted;
  }

  public String fullAddress() {
    String formattedAddress = this.name + ", " + this.street;
    formattedAddress += ", " + this.postCodeAndCity();
    return formattedAddress;
  }
}
