package day35_Encapsulation.encapsulation;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1= new Employee("gulsah",'b',35, 25000);
        System.out.println(employee1);

        employee1.setAge(36);
        System.out.println(employee1);

        Employee employee2=new Employee("Ercu",'M',38,45000);

        System.out.println(employee2);

        employee2.setSalary(employee2.getSalary()+12000);
        System.out.println(employee2);
    }
}
