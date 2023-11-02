
package price;


public class Price {
    
    private double quantity;
    private double unitPrice;

    public Price() {
    }

    public Price(double quantity, double unitPrice) {
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    
    public double calculateTotalPrice (){
        double totalPrice=unitPrice*quantity;
        return totalPrice;
        
    }
  
    
    
    
}
