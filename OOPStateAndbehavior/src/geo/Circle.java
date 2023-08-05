
package geo;


public class Circle {
    
    public double radius;
    
    public double getArea(){
        double area=Math.PI*radius*radius;
        return area;
    }
    
    public double gePerimeter(){
        double perimeter=2* Math.PI*radius;
        return perimeter;
    }
}
