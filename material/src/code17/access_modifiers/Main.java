package code17.access_modifiers;

//import session08g.access_modifiers.subpackage.PackageProtectedClass;

public class Main {

  public static void main(String[] args) {
    BaseClass bc;
    bc = new BaseClass("Hallo");
    System.out.println(bc.publicAttribute);

//        BaseClass baseClass = new BaseClass(32);
//        BaseClass baseClass = new BaseClass();
//        SubClass subClass = new SubClass();
//        subClass.doSomething();
//        subClass.protectedMethod();

//        PackageProtectedClass subpackageClass = new PackageProtectedClass();
//        PublicClass subpackageClass = new PublicClass();
//        System.out.println(subpackageClass.publicAttribute);
  }
}
