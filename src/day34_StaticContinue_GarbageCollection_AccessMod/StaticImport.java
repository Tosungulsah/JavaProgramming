package day34_StaticContinue_GarbageCollection_AccessMod;

import static day34_StaticContinue_GarbageCollection_AccessMod.Circle.pi;  // static import
public class StaticImport {

    public static void main(String[] args) {
        System.out.println(Circle.pi);
        System.out.println(pi); // you dont have to use class name.
        System.out.println(Circle.numbers);
    }
}
