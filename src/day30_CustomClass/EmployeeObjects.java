package day30_CustomClass;

import java.util.Arrays;

public class EmployeeObjects {
    public static void main(String[] args) {

        Employee employee1= new Employee();
        employee1.setInfo("Gulsah",2255,'F',"QA",40000, true);

        Employee employee2= new Employee();
        employee2.setInfo("Ercu",2255,'M',"Engineer",45000, true);

        Employee employee3= new Employee();
        employee3.setInfo("Merve",2255,'F',"Sale Management",41000, false);

        Employee[] employees = {employee1,employee2,employee3};

        System.out.println(Arrays.toString(employees));

        for (Employee employee : employees) {

            System.out.println(employee.name + " : £" + employee.salary);
        }

        int countFullTime=0;
        int countPartTime=0;
        double max= employees[0].salary;
        double min= employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }
            if(employee.salary>max){
                max=employee.salary;
            }
            if(employee.salary<min){
                min=employee.salary;
            }
        }
        System.out.println("FullTime employees = " + countFullTime);
        System.out.println("PartTime employees= " + countPartTime);

        System.out.println("min = " + min);
        System.out.println("max = " + max);


    }
}
