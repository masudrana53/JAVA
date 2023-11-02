
package question2;

import pack.G_Class;


public class Question2 {


    public static void main(String[] args) {
        
        G_Class<Integer,String> object1=new G_Class<Integer,String> (125, "Masud");
        object1.getMethod();
        
        G_Class<Boolean,Float> object2=new G_Class<Boolean,Float> (true, 52421.221f);
        object2.getMethod();
    }
    
}
