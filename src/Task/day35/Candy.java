package Task.day35;

public class Candy {
    private String brand;
    private int quantity;
    private double price;
    private boolean hasPeanut;


    public Candy(String brand, int quantity, double price, boolean hasPeanut) {
        this.brand = brand;
        this.quantity = quantity;
        this.price = price;
        this.hasPeanut = hasPeanut;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity<=0){
            System.err.println("Invalid quantity: "+ quantity);
            System.exit(1);
        }


        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
       if(price<0)
       {
           System.err.println("Invalid Price: "+ price );
           System.exit(1);
       }

        this.price = price;
    }

    public boolean isHasPeanut() {
        return hasPeanut;
    }

    public void setHasPeanut(boolean hasPeanut) {
        this.hasPeanut = hasPeanut;
    }
    public double costCalc(){
        return  quantity * price;
    }

    public String toString() {
        return "Candy{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" +(( price == 0)?"Free": ""+ price )+
                ", total price=" + ( (costCalc()==0)?"Free":""+costCalc())+
                ", hasPeanut=" + hasPeanut +
                '}';
    }
}
