
package vehiclemanagementsystem;

import pack.Car;
import pack.MotorCycle;
import pack.Vehicle;


public class VehicleManagementSystem {

   
    public static void main(String[] args) {
        
        Vehicle car = new Car("GA=5241", "BMW", 2020);
        Vehicle motorCycle = new MotorCycle("LA-407274", "yamaha", 2021);
        
        car.start();
        car.stop();
        
//        car.setYear(200);
//        System.out.println(car.getYear());
        
        motorCycle.start();
        motorCycle.stop();
        
        
    }
    
}
