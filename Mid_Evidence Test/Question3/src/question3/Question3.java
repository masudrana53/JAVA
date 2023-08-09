/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import pack.Truck;
import pack.Vehicle;

/**
 *
 * @author user
 */
public class Question3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Vehicle vahicle = new Vehicle();
        Truck truck = new Truck();
        
       
        
        truck.setRegularPrice(5000);
        truck.setWeight(3000);
      
        
        System.out.println(truck.getSalePrice());
        
        
    }
    
}
