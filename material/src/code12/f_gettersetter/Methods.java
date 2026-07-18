package code12.f_gettersetter;

public class Methods {

  public static void main(String[] args) {
    Address beate = new Address("Beate Beispiel", "Lindenstr. 1",
            "Konstanz", 78462, true);
    System.out.println(beate.toString());
    // Beate zieht um
//        beate.city = "Speyer";
//        beate.postcode = 67346;
//        beate.street = "Ulmenstr. 25b";
    beate.setAddress("Ulmenstr. 25b", 67346, "Speyer");
    System.out.println(beate.toString());

    String postCodeAndCity = beate.postCodeAndCity();
    System.out.println(postCodeAndCity);
    String fullAddress = beate.fullAddress();
    System.out.println(fullAddress);
  }
}
