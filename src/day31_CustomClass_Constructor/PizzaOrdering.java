package day31_CustomClass_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> pizzas = new ArrayList<>();
        //create 100 pizza objects: size = S , cheese Topping= 2, pepperoni Topping = 3
        //create 100 pizza objects: size = M , cheese Topping= 3, pepperoni Topping = 4
        //create 100 pizza objects: size = L , cheese Topping= 4, pepperoni Topping = 5

        for (int i = 0; i < 100; i++) {
        Pizza small= new Pizza('S',2,3);
        Pizza medium= new Pizza('M',3,4);
        Pizza large = new Pizza('L',4,5);

        pizzas.addAll(Arrays.asList(small,medium,large));
        }
        System.out.println("Number of Pizza: " + pizzas.size());
        double totalPrice=0;

        for (Pizza pizza : pizzas) {
         totalPrice+=   pizza.calCost();
        }
        System.out.println("totalPrice = " + totalPrice);

        System.exit(0);
    }
}
