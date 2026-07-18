package code17.access_modifiers;

public class SubClass extends BaseClass {

  public SubClass() {
    super(21, 22);
  }

  public void doSomething() {
    //System.out.println(this.privateAttribute);
//        privateMethod();
    System.out.println(this.protectedAttribute);
    protectedMethod();
  }

  @Override
  public void protectedMethod() {
    System.out.println("This method is now public and not ");
    super.protectedMethod();
  }
}
