package Task.day35;

public class RectangleObjects {
    public static void main(String[] args) {
        Rectangle rectangle1= new Rectangle(6,5);
        System.out.println("Area of rectangle: " + rectangle1.calcArea()+"cm²");
        System.out.println("Perimeter of rectangle: "+rectangle1.Perimeter()+"cm");

        Rectangle rectangle2= new Rectangle(-5,5);
        System.out.println("x " + rectangle2);
    }

}
