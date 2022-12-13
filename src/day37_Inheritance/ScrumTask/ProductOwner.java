package day37_Inheritance.ScrumTask;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender, String companyName, int id, double salary) {
        super(name, age, gender, "Product Owner", companyName, id, salary);
    }

}
