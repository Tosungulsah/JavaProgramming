package Task.day35;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("invalid enter");
            return;
        }
        this.side = side;
    }
    public double calcArea( ) {
        double area = side * side;
        return area;
    }
    public double calcPerimeter() {
        double per = side * 4;
        return per;
    }
    public String toString() {
        return "square{" +
                "side=" + side +
                "area=" + calcArea() +
                "perimeter =" + calcPerimeter() +
                '}';
    }
    public static void main(String[] args) {
        Square square1 = new Square(12);

        System.out.println(square1);
    }
}

/* Create a class named Square:
        Private variables:
       side

        Encapsulate all the fields

        Condition:
        side of the square should not be negative

        Add a constructor that allows user to set all the fields when the object is created.
        (If the arguments not valid it should not be set to the instances)

        Methods:
        calcArea(): returns the area of square
        calcPerimeter(): returns the perimeter of square
        toString(): can display the side, area, perimeter of square when object is passed in print statement*/

