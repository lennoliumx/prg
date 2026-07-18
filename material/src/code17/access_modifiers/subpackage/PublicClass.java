package code17.access_modifiers.subpackage;

public class PublicClass {

  public PublicClass() {
    PackageProtectedClass ppc = new PackageProtectedClass();
  }

  public int publicAttribute = 3;
}
