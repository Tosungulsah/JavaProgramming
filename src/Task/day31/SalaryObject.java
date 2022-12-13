package Task.day31;

public class SalaryObject {
    public static void main(String[] args) {
        SalaryCalculator salaryobj = new SalaryCalculator(37, 12, 2.5, 1.5);
        System.out.println(salaryobj);
        System.out.println(  salaryobj.salaryAfterTax());
    }
}
