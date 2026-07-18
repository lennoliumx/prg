package code12.d_constructor;

public class Address {


  public String name;
  public String street;
  public String city;
  public int postcode;
  public boolean favorite;

  public Address() {
    System.out.println("address initiated");
  }

  public Address(String name, String street, String city, int postcode, boolean favorite) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.postcode = postcode;
    this.favorite = favorite;
  }
}
