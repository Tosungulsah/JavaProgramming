package day35_Encapsulation;

public class CydeoStudents {
    /* 2. create a class named CybertekStudent
               Variables:
       name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
       Add a constructor to initialize all the fields
       Add a static block to initialize all the statics
       methods:
       printSchoolName();
       printSecretCode();
       attendClass():
       study()
       toString()
       */
    public String name, fieldOfStudy;
    public char gender;
    public int age, batchNumber, groupNumber;
    public static String schoolName;
    public static String programmingLanguage;
    public static String secretCode;



    public CydeoStudents(String name, String fieldOfStudy, char gender, int age, int batchNumber, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }

    static{
        schoolName= "Cydeo";
        programmingLanguage= "Java";
        secretCode="Wooden Spoon";
    }
    public static void setProgrammingLanguage (){
        System.out.println("Language is "+ programmingLanguage);
    }

    public static void printSchoolName(){
        System.out.println("School is "+ schoolName);
    }

    public static void printSecretCode(){
        System.out.println("Secret code is "+secretCode);
    }

    public void attendCalss(){
        System.out.println(name+"is attending class.");
    }

    public void study(){
        System.out.println(name+ "is studying. ");
    }

    public String toString() {
        return "CydeoStudents{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
