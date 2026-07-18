package code14;

public class ParameterPassingString {

  public static void doSomething(String stringParam) {
    // Kann ich hier den Speicherinhalt hinter stringParam verändern?
    // - So nicht: stringParam = "Bye"; denn dadurch weise ich nur der lokalen
    //   Variable stringParam einen neuen Speicherbereich mit neuem String zu.
    stringParam = "Bye";
    // - Sowas gibt es nicht: stringParam.setNewContent("Bye!");
    // Fazit: Geht nicht (zumindest nicht "legal" über String-Methoden)
  }

  public static void main(String[] args) {
    String stringMain = "Hallo";
    doSomething(stringMain);
    System.out.println(stringMain);
  }
}
