package code17.access_modifiers;

public class BaseClass {

  private int privateAttribute = 0;
  protected int protectedAttribute = 1;
  public String publicAttribute;

  private BaseClass(int privateAttribute) {
    this.privateAttribute = privateAttribute;
  }

  protected BaseClass(int privateAttribute, int protectedAttribute) {
    this.privateAttribute = privateAttribute;
    this.protectedAttribute = protectedAttribute;
  }

  public BaseClass(String publicAttribute) {
    this.publicAttribute = publicAttribute;
  }

  private void privateMethod() {
    System.out.println("private");
  }

  protected void protectedMethod() {
    System.out.println("protected");
  }
}
