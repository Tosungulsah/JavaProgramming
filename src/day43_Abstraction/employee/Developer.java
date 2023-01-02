package day43_Abstraction.employee;

public final class Developer extends Employee {
    public Developer(String name, int age, char gender, int id, double salary) {
        super(name, age, gender, id, "developer", salary);
    }

    @Override
    public void work() {
        System.out.println(getName()+" is working 8 hours.");
    }

    @Override
    public void sleep() {
        System.out.println(getName()+ " is working 8 hours");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating fishcake");
    }
    public void code(){
        System.out.println(getJobTitle()+ " is writing code.");
    }
}
