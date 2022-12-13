package Task.day35;

public class Item {
    public String name;
    public double unitPrice;
    public int quantity;

    public Item(String name, double unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
       if(name.isEmpty()|| name.isBlank() ||  name == null){
           System.err.println("Invalid Name: "+name);
           System.exit(1);
       }
        String specialChars="";
      for( char each : name.toCharArray()){
          if ( !Character.isLetterOrDigit(each) && each != ' '){
              specialChars += each;
          }
      }
        if(specialChars.length() > 0){ // if contains special characters other than space
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }
        if(!Character.isLetter(name.charAt(0))){ // if name does not start with letter
            System.err.println("Invalid Name: "+name);
            System.exit(1);
        }

        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity <= 0){
            System.err.println("Invalid quantity: "+quantity);
            System.exit(1);
        }

        if(name.equalsIgnoreCase("toilet paper")){
            this.quantity = 1;
        }
        this.quantity = quantity;
    }
    public double calcCost(){
        return unitPrice * quantity;
    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                '}';
    }
}
