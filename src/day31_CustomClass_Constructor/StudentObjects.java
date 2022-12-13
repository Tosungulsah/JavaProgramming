package day31_CustomClass_Constructor;

public class StudentObjects {
    public static void main(String[] args) {
        Student student1= new Student("Ekin",4,'M','A',2);
        System.out.println("student1 = " + student1);
        Student student2=new Student("Kemal",6,'M','A',1);
        System.out.println("student2 = " + student2);

        System.exit(0);
    }
}
