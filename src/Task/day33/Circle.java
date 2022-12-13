package Task.day33;

public class Circle {
    public int radius,diameter;
    public static double pi= 3.14;

    public Circle(int radius) {
        this.radius = radius;
        diameter = radius*2;
    }
    public double calcArea(){
        return radius*radius*pi;
    }
    public double calcPerimeter(){
        return diameter*pi;
    }

    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", diameter=" + diameter +
                '}';
    }
}
