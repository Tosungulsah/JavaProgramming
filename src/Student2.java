import java.util.Arrays;

public class Student2 {
    public String name;
    public char gender;
    public int age;
    public int studentID;
    public char grade;

    public Student2(String name) {
        this.name = name;
    }

    public Student2(String name, char gender) {
        this(name);
        this.gender = gender;
    }

    public Student2(String name, int studentID) {
        this(name);
        this.studentID = studentID;
    }

    public Student2(String name, int studentID, char grade) {
        this(name, studentID);
        this.grade = grade;
    }

    public Student2(String name, char gender, int age) {
        this(name, gender);
        this.age = age;
    }

    public Student2(String name, char gender, int age, int studentID) {
        this(name, gender, age);
        this.studentID = studentID;
    }

    public Student2(String name, char gender, int age, int studentID, char grade) {
        this(name, gender, age, studentID);
        this.grade = grade;
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", studentID=" + studentID +
                ", grade=" + grade +
                '}';
    }

}
class StudentObjects{
    public static void main(String[] args) {
        day33_CustomClass_Statics.Student2 student1 =new day33_CustomClass_Statics.Student2("Ahmet");
        day33_CustomClass_Statics.Student2 student2= new day33_CustomClass_Statics.Student2("Gulsah",'F');
        day33_CustomClass_Statics.Student2 student3 = new day33_CustomClass_Statics.Student2("Kemal",5564);
        day33_CustomClass_Statics.Student2 student4= new day33_CustomClass_Statics.Student2("Ekin",'M',4);

        System.out.println("student1 = " + student1);
        System.out.println("student2 = " + student2);
        System.out.println("student3 = " + student3);
        System.out.println("student4 = " + student4);

        day33_CustomClass_Statics.Student2[] students={student1,student2,student3,student4};
        System.out.println(Arrays.toString(students));
    }
}
