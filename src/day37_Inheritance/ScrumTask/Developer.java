package day37_Inheritance.ScrumTask;

public class Developer extends Employee{

    public Developer(String name, int age, char gender, String jobTitle, String companyName, int id, double salary) {
        super(name, age, gender, jobTitle, companyName, id, salary);
    }

    public void fixBugs(){
        System.out.println(jobTitle+ " "+ name+ " is crying");
    }
}
