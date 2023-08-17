/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack;

/**
 *
 * @author user
 */
public class Car extends Vahicle{

    public Car() {
    }

    public Car(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    
    

    @Override
    public void start() {
        System.out.println("Car Start");
    }

    @Override
    public void stop() {
        System.out.println("Car Stop");
    }

    @Override
    public void details() {
        super.details(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
