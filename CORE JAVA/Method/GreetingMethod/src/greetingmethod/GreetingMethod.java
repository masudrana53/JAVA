
package greetingmethod;

import java.util.Scanner;
import pack.GreetingClass;


public class GreetingMethod {

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        GreetingClass gc = new GreetingClass();
        
        System.out.println("Enter your name");
        String input=sc.nextLine();
        
        System.out.println(gc.gret(input));

    }
}
