package Task.day33;

public class CircleObjects {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        System.out.println(circle1.diameter);
        System.out.println(circle1);
        System.out.println("The perimeter is : " + circle1.calcPerimeter());
        System.out.println("The are of circle is: "+ circle1.calcArea());
    }
}
