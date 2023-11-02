

package pack;


public class MotorCycle extends Vehicle {

    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    

    @Override
    public void start() {
        System.out.println("Motor Cycle start");
    }

    @Override
    public void stop() {
        System.out.println("Motor Cycle stop");
    }

    @Override
    public void details() {
        super.details(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
