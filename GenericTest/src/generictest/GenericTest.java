
package generictest;

import pack.AdditionG_Class;


public class GenericTest {

   
    public static void main(String[] args) {
        
        AdditionG_Class<Integer,String> object=new AdditionG_Class<Integer,String>(101, "Masud");
        object.getMethod();
        
        AdditionG_Class<Boolean, Double> object1=new AdditionG_Class<Boolean, Double>(false, Math.random());
        object1.getMethod();
        
        AdditionG_Class<Float,Character> object2=new AdditionG_Class<Float,Character>(52.0f, 'a');
        object2.getMethod();
    }
    
}
