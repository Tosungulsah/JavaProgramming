package day34_StaticContinue_GarbageCollection_AccessMod;

public class CydeoStudent {
    public String studentName ;
    public static String schoolName;

    public CydeoStudent(String studentName){
        this.studentName=studentName;
       // schoolName="Cydeo"; not this way we should use static
    }
    static {
        schoolName= "Cydeo";
    }

}
class CydeoStudentObject{
    public static void main(String[] args) {
        CydeoStudent student1= new CydeoStudent("Kemal");
        CydeoStudent student2= new CydeoStudent("Ekin");
        System.out.println(student1.schoolName);
        System.out.println(student2.schoolName);
    }
}
