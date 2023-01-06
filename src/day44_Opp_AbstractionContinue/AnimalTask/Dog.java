package day44_Opp_AbstractionContinue.AnimalTask;

public final class Dog extends Animal implements Playable{

    public Dog(String name, String size, String breed, String colour, char gender, int age) {
        super(name, size, breed, colour, gender, age);
    }

    public void bark(){
        System.out.println(getName()+ " is barking");
    }

    @Override
    public void eat() {
        System.out.println(getName()+ " is eating dog food.");
    }

    public void play(){

    }
}
