package day36_Inheritance.encapsulation;

public class StudentObject {
    public static void main(String[] args) {
        Student student1 = new Student("gulsah","Cydeo",35,'A','F');
        System.out.println(student1);
        student1.setAge(36);
        System.out.println(student1);
    }
}
