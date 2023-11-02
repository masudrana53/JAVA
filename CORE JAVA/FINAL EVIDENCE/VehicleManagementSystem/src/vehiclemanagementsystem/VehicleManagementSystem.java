
package vehiclemanagementsystem;

import pack.Car;
import pack.MotorCycle;
import pack.Vehicle;


public class VehicleManagementSystem {

   
    public static void main(String[] args) {
        
        Vehicle car = new Car("A-50221", "Land Cruiser", 2018);
        Vehicle motorCycle = new MotorCycle("LA-40-7274", "MT-15", 2023);
        
        
        car.start();
        car.stop();
//        car.details();

        //For toString
        System.out.println(car.toString());
       
             
        motorCycle.start();
        motorCycle.stop();
//        motorCycle.details();

        //For toString
        System.out.println(motorCycle.toString());
        
        
        
    }
    
}
