package code16;

public class VarArgsAdvancedMain {

  public static void main(String[] args) {
//        System.out.println(VarArgsAdvanced.sumUp(23));
    System.out.println(VarArgsAdvanced.sumUp(23, 42));
    System.out.println(VarArgsAdvanced.sumUp(23, 42, 1414));
    System.out.println(VarArgsAdvanced.sumUp(23, 42, new int[]{1414}));
    System.out.println(VarArgsAdvanced.sumUp(23, 42, 1414, 1418));
    System.out.println(VarArgsAdvanced.sumUp(23, 42, 1414, 1418, -1418, -1414, -23, 0, 0));

    //System.out.println(VarArgsAdvanced.sumUp(23, 42, new int[]{1, 2}));
//        System.out.println(VarArgsAdvanced.sumUp(23, 42, null));

//        VarArgsAdvanced.printWithPrefix("> ");
//        System.out.println();
//        VarArgsAdvanced.printWithPrefix("> ", null);
//        System.out.println();
//        VarArgsAdvanced.printWithPrefix("- ", 2.0);
//        System.out.println();
//        VarArgsAdvanced.printWithPrefix("+ ", 2.0, 4.0, 8.0, 16.0);
//        System.out.println();
//        double[] numbers = {2.0, 4.0, 8.0, 16.0};
//        VarArgsAdvanced.printWithPrefix("# ", numbers);

  }
}
