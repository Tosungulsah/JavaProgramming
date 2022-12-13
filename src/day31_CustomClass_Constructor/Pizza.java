package day31_CustomClass_Constructor;

public class Pizza {
    public char size;
    public int numberOfCheeseTopping;
    public int numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }
    //actions calculating cost
    public double calCost(){
        double startingPrice= (size=='S')? 10 :(size=='M')? 12 :14;
        double totalPrice= startingPrice+(numberOfCheeseTopping+numberOfPepperoniTopping)*2;
   return totalPrice;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Price= £" + calCost() +
                '}';
    }
}
