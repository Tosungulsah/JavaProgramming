package day44_Opp_AbstractionContinue.AnimalTask;

public final class Parrot extends Animal implements Playable,Flyable{

    public Parrot(String name, String size, String breed, String colour, char gender, int age) {
        super(name, size, breed, colour, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating");
    }

    public void fly(){
        System.out.println(getName()+ "is flying");
    }
    public void play(){
        System.out.println(getName()+" is playing");
    }
}
