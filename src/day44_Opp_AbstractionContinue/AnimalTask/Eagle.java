package day44_Opp_AbstractionContinue.AnimalTask;

public final class Eagle extends Animal implements WildAnimal, Flyable{

    public Eagle(String name, String size, String breed, String colour, char gender, int age) {
        super(name, size, breed, colour, gender, age);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is eating mouse.");
    }

    public void fly(){
        System.out.println(getName()+ " is flying high.");
    }

    @Override
    public void hunt() {
        System.out.println(getName()+" is hunting snake");
    }


}
