package Task.day33;

public class DogObject {
    public static void main(String[] args) {
        Dog dog1= new Dog("Sweet","Husky","White","Large",5,'F');
        System.out.println(dog1);
        dog1.eat();
        dog1.sleep();
        dog1.play();

    }
}
