package day34_StaticContinue_GarbageCollection_AccessMod;

public class StaticBlock {
    public static void main(String[] args) {
        System.out.println("Main method ");
    }
    static {
        System.out.println("Static Block1 ");
    }
    static {
        System.out.println("Static Block2");
    }
    static {
        System.out.println("Static Block 3 ");
    }


}
