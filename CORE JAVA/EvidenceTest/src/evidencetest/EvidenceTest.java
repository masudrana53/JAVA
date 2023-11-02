
package evidencetest;

import java.util.Scanner;
import price.Price;


public class EvidenceTest {

    
    public static void main(String[] args) {
        
       Scanner s = new Scanner(System.in);
       Price price = new Price();
       
        System.out.println("Enter unit Price");
        double unitPrice = s.nextDouble();
        System.out.println("Enter Quantity no");
        double quantity = s.nextDouble();
        
        
        double actualPrice=0.0;
        
        price.setQuantity(quantity);
        price.setUnitPrice(unitPrice);
        
        double totalPrice=price.calculateTotalPrice();
        double discount=0.0;
        if(totalPrice>=100){
            discount = totalPrice*.05;
            actualPrice = totalPrice-discount;

        }
        else{
            actualPrice = totalPrice;
        }
        
        System.out.println("Actual Price is "+Math.round(actualPrice)+"\nTotal discount is "+discount);
        System.out.println("Thanks! Stay wiht us");
        
        
        
        
        
       
        
    }
    
}
