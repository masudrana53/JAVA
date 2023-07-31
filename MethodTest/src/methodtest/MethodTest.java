
package methodtest;

import java.util.Scanner;
import pac.NewClass;




public class MethodTest {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        NewClass nc = new NewClass();
        
        System.out.println("Enter number ");
        int input=sc.nextInt();
        
        System.out.println(nc.prime(input));
       
    }
    
}
