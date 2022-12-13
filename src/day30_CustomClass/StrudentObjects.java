package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class StrudentObjects {
    public static void main(String[] args) {

        Student student1= new Student();
        student1.setInfo("Gulsah",'F',35,476,'A');

        Student student2= new Student();
        student2.setInfo("Jane",'F',42,477,'A');


        Student student3= new Student();
        student3.setInfo("Micheal",'M',33,475,'B');

        Student student4= new Student();
        student4.setInfo("Mich",'M',32,474,'C');

        Student student5= new Student();
        student5.setInfo("Ercu",'M',37,473,'A');

        Student[] students= { student1,student2,student3,student4,student5};

        System.out.println(Arrays.toString(students));

        for (Student student : students) {
            System.out.println(student);
        }
        System.out.println("***************************************************************");
        ArrayList<Student> earlyBirds= new ArrayList<>(); //grade A
        ArrayList<Student> angryBirds= new ArrayList<>();
        for (Student student : students) {
            if(student.grade=='A'){
                earlyBirds.add(student);
            }else{
                angryBirds.add(student);
            }
        }
        System.out.println("earlybirds :"+earlyBirds);
        System.out.println("angryBirds :"+angryBirds);

    }
}
