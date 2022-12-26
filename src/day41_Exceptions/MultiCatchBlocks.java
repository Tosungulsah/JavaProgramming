package day41_Exceptions;


import day39_EncapsulationInheritance.cydeoTask.employee;

public class MultiCatchBlocks {
    public static void main(String[] args) {
        employee employee= null;
        try{
            System.out.println(employee.getSalary());
        } catch (IndexOutOfBoundsException e ){
            System.out.println("1st catch block ");
            e.printStackTrace();
        } catch(ArithmeticException e){
            System.out.println("2nd catch block ");
            e.printStackTrace();

        }catch(NullPointerException e){
            System.out.println("3rd catch block");
            e.printStackTrace();
        }catch (RuntimeException e){ // this is parent must be end
            System.out.println("4rd catch block ");
            e.printStackTrace();
        }
    }
}
