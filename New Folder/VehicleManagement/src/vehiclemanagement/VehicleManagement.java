
package vehiclemanagement;

import pack.Car;
import pack.MotorCycle;
import pack.Vahicle;


public class VehicleManagement {

    
    public static void main(String[] args) {
        
        Vahicle car = new Car("GA-45620", "Land Cruiser", 2020);
        Vahicle motorCycle = new MotorCycle("LA-40-7274", "YAMAHA MT-15", 2021);
        
        car.start();
        car.stop();
        car.details();
        
        motorCycle.start();
        motorCycle.stop();
        motorCycle.details();
    }
    
}
