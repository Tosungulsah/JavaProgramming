package Task.day35;

public class Rectangle {
  private double width,length;

    public Rectangle(double width, double length) {
        setWidth(width);
        setLength(length);
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<=0){
            return;
        }
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
       if(length<=0){
           return;
       }

        this.length = length;
    }

    public double calcArea(){
        return width*length;
    }
    public double Perimeter(){
        return (width+length)*2;
    }

    public String toString() {
        return "Rectangle{" +
                "witdh=" + width +
                ", length=" + length +
                '}';
    }
}

