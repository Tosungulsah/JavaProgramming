package Task.day33;

public class CydeoStudent {
    public String name;
    public char gender,grade;
    public int id,batchNumber,groupNumber;
    public static String schoolName= "Cydeo";
    public static String programmingLanguage= "Java";

    public CydeoStudent(String name, char gender, char grade, int id, int batchNumber, int groupNumber) {
        this.name = name;
        this.gender = gender;
        this.grade = grade;
        this.id = id;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    public void study(){
        System.out.println(name+ " is studying");
    }
    public void attendClass(){
        System.out.println(name + " is attending");
    }
    public static void printSchoolName(){
        System.out.println("The school name is "+ schoolName);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", grade=" + grade +
                ", id=" + id +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
