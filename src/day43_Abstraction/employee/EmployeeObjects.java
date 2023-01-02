package day43_Abstraction.employee;

public class EmployeeObjects {
    public static void main(String[] args) {

        Developer developer= new Developer("Ercu",38,'M',45,40000);
        Driver driver=  new Driver("xxxx",38,'F',44,"driver",36555);
        Tester tester= new Tester("Gulsah",36,'F',43,45000);
        Teacher teacher= new Teacher("fffu",34,'M',49,25000);

        System.out.println("teacher = " + teacher);
        System.out.println("tester = " + tester);
        System.out.println("driver = " + driver);
        System.out.println("developer = " + developer);

        tester.work();
        tester.sleep();
        tester.bugReport();
        tester.eat();

    }
}
