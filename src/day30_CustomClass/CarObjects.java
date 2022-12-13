package day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {
        Car car1= new Car();
        car1.setinfo("Mercedes","G","Black",2021,35000);
        System.out.println(car1);

        car1.drive();
        car1.start();
        car1.stop();

        Car car2= new Car();
        car2.setinfo("Toyota","X","Grey",2022,22000);
        System.out.println(car2);

        Car car3= new Car();
        car3.setinfo("AUDI","Q7","Red",2019,40000);
        System.out.println(car3);


       // Car[] cars={car1,car2,car3};
        ArrayList<Car> carlist= new ArrayList<>();
        carlist.addAll(Arrays.asList(car1,car2,car3));

        System.out.println(carlist);

        for (Car each : carlist) {
            System.out.println(each.brand + " : " + each.price);

            System.out.println("******************************************");

        } /*
            bmw 2005 2022
            audi 2021 2022
             */

            carlist.removeIf(p-> p.brand.equals("Mercedes") && p.year>=2005 && p.year<=2022 );
            carlist.removeIf(p-> p.brand.equals("AUDI") && p.year>=2021 && p.year<=2022 );

        System.out.println(carlist);

    }
        }


