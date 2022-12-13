package day35_Encapsulation.encapsulation;



public class PersonObjects {
    public static void main(String[] args) {
        Person p1= new Person();
        p1.setName("Daniel");
        p1.setAge(1222);

        System.out.println("name " +  p1.getName());
        System.out.println("age "+ p1.getAge());

    }
}
