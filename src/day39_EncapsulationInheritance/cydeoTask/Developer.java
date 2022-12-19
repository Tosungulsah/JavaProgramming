package day39_EncapsulationInheritance.cydeoTask;

public class Developer extends employee{

    public Developer(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    public void bugs(){
        System.out.println(getJobTitle()+" "+ getName()+ " is creating bugs. :) ");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle()+" "+ getName()+ " is working. ");
    }
}
