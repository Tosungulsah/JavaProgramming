package day32_Constructor;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee employee1=new Employee("Gulsah");
        System.out.println("employee1 = " + employee1);
        Employee employee2= new Employee("Ercu",'M');
        System.out.println("employee2 = " + employee2);

        Employee employee3= new Employee("Onur",'M',"Engineer",25000);

    }
}
