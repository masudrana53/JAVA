
package oopstateandbehavior;

import geo.Circle;


 
public class OOPStateAndbehavior {

    
    public static void main(String[] args) {
        Circle c=new Circle();
        c.radius=5;
         
        System.out.println("Area: "+c.getArea());
        System.out.println("Perimeter: "+c.gePerimeter());
        
    }
    
}
