package day44_Opp_AbstractionContinue.AnimalTask;

public class Cat extends Animal implements Playable {

    public Cat(String name, String size, String breed, String colour, char gender, int age) {
        super(name, size, breed, colour, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating fish");
    }

    public void meow(){
        System.out.println(getName()+" is meowing");
        }

    @Override
    public void play() {

    }
}
