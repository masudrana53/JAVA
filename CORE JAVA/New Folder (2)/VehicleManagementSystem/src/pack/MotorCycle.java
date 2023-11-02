
package pack;


public class MotorCycle extends Vehicle {

   
    public MotorCycle() {
    }

    public MotorCycle(String registrationNumber, String brand, int year) {
        super(registrationNumber, brand, year);
    }
    
    

    @Override
    public void start() {
        System.out.println("MotorCycle Start");
    }

    @Override
    public void stop() {
        System.out.println("MotorCycle Stop");
    }

    @Override
    public void details() {
        super.details(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
