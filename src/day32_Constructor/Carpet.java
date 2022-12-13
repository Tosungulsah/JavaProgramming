package day32_Constructor;

public class Carpet {
    public double length, width,unitPrice;
    public boolean isPersian;

    public String toString() {
        return "Carpet{" +
                "length=" + length +
                ", width=" + width +
                ", unitPrice= £" + unitPrice +
                ", isPersian= " + isPersian +
                ", total price= £" + calcCost() +
                '}';
    }

    public Carpet(double length, double width, double unitPrice, boolean isPersian) {
        this.length = length;
        this.width = width;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }
    public double calcCost(){
        double totalPrice= (width*length)*unitPrice;

        if(isPersian){
            totalPrice +=200;
        }
        return totalPrice;
    }
}
