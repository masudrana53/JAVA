/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trav;

/**
 *
 * @author user
 */
public class MotorCycle extends Vehicle {

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    

    

    @Override
    public void start() {
        System.out.println("Motor Cycle Start");
    }

    @Override
    public void stop() {
        System.out.println("Motor Cycle Stop");
    }
    
}
