package utilities;

import day40_FinalKeyword.ProtectedAccessModifier;

public class AccessModifierTest4 extends ProtectedAccessModifier {
    public static void main(String[] args) {
        //System.out.println(ProtectedAccessModifier.name1); default is not visible
        System.out.println(ProtectedAccessModifier.name2);

        AccessModifierTest4.method2();
    }
}
