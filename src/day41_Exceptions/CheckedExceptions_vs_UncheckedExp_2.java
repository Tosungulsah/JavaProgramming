package day41_Exceptions;

import day36_Inheritance.encapsulation.Student;

import java.io.FileInputStream;
import java.sql.SQLOutput;

public class CheckedExceptions_vs_UncheckedExp_2 {
    public static void main(String[] args) {

      ///  char[] characters= {'A','B','C'};
        //System.out.println(characters[99]);

       // Student student= null;
       // System.out.println(student.getName());

      final  String str= "Wooden spoon";
       // str= null;
       // System.out.println(str.toUpperCase());


        String str2= "";
        System.out.println(str2.isEmpty());


        // Checked Exception

        System.out.println("Hello");
       // Thread.sleep(3000);
        System.out.println("Cydeo");

       // FileInputStream file = new FileInputStream("path of the file ");
    }
}
