package day34_StaticContinue_GarbageCollection_AccessMod;

public class AccessModifier {
    public static int publicData= 100;
    static int defaultData= 200; // access modifier default
    private static int privateData= 300;

    public static void main(String[] args) {
        System.out.println("publicData = " + publicData);
        System.out.println("defaultData = " + defaultData);
        System.out.println("privateData = " + privateData);
}
    public static void method1(){
            System.out.println("Public");
        }
        static void  method2(){
            System.out.println("default ");
        }
        private static void method3(){
        System.out.println("Private");
        }
    }


