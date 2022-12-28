package day42_ExceptionContinue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DisadvantageOfThrowKeyword2 {
        public static void method1() throws FileNotFoundException {

          //  new FileInputStream("");
        }
            public static void method2() throws FileNotFoundException {
                method1();
            }
            public static void method3() throws FileNotFoundException, InterruptedException {
            method2();
            Thread.sleep(1000);
            }
            public static void method4() throws Exception {
            method3();
            }

    public static void main(String[] args) throws Exception {
        method4();
        method3();
        method2();

        String str= null;
     try{
         System.out.println(str.charAt(0));
     }catch(RuntimeException e){
         e.printStackTrace(); // you cant use Throw keyword for unchecked exceptions
        }



    }
}

