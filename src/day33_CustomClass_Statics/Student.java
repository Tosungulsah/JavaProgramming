package day33_CustomClass_Statics;

public class Student {
    public String name;
    public char gender,grade ;
    public int age, studentID ;

    public Student(String name){
        this.name= name;
    }
    public Student(String name,char gender) {
        this(name);
        this.gender=gender;
    }
    public Student(String name,char gender,char grade){
        this(name,gender);
        this.grade=grade;
    }
    public Student(String name,char gender,char grade,int age){
        this(name,gender,grade);
        this.age=age;
    }
    public Student(String name,char gender,char grade,int age,int studentID){
        this(name,gender,grade,age);
        this.studentID=studentID;
    }

}
