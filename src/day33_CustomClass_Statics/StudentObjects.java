package day33_CustomClass_Statics;

import java.util.Arrays;

public class StudentObjects {
    public static void main(String[] args) {
        Student2 student1 =new Student2("Ahmet");
        Student2 student2= new Student2("Gulsah",'F');
        Student2 student3 = new Student2("Kemal",5564);
        Student2 student4= new Student2("Ekin",'M',4);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);

        Student2[] students={student1,student2,student3,student4};
        System.out.println(Arrays.toString(students));
    }
}
