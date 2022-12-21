package day40_FinalKeyword;

public class Zoo{
    public static void main(String[] args) {

        Dog dog= new Dog("Max","Husky",'F',"Black","large",2);
        System.out.println(dog.getBreed());
        System.out.println(dog.getGender());
        dog.drink();
        dog.eat();
    }
}
