package day39_EncapsulationInheritance.Shapes;

public class ShapeObjects {
    public static void main(String[] args) {
        Square square= new Square(25);
        Rectangle rectangle=new Rectangle(20,10);
        Circle circle=new Circle(10);


        System.out.println(square);
        System.out.println(rectangle);
        System.out.println(circle);
    }
}
