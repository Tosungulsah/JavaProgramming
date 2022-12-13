package day37_Inheritance.ScrumTask;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender,  String companyName, int id, double salary) {
        super(name, age, gender, "Scrum Master", companyName, id, salary);
    }

    public void check(){
        System.out.println(name+ " is checking teams day");
    }
}
