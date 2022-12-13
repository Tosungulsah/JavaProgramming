package day37_Inheritance.ScrumTask;

public class BusinessAnalyst extends Employee {

    public BusinessAnalyst(String name, int age, char gender, String companyName, int id, double salary) {
        super(name, age, gender, "Business Analyst", companyName, id, salary);
    }

    public void analyze (){
        System.out.println(name+ " is analyzing the documents");
    }


}
