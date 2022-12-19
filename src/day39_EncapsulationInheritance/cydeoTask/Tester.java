package day39_EncapsulationInheritance.cydeoTask;

public class Tester extends employee{


    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void work(){
        System.out.println(getName()+" is working as a tester.");
    }
    public void createTicket(){
        System.out.println(getJobTitle()+ " "+ getName()+ " is creating ticket.");
    }

}
