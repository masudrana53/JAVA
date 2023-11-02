
package factorialinrecurtion;

import java.util.Scanner;


public class FactorialInRecurtion {


    public static void main(String[] args) {
        
       Scanner input=new Scanner(System.in);
        System.out.println("Please enter number: ");
        int userInput=input.nextInt();
        
        int result = fact(userInput);
        System.out.println("Factorial number is "+result);

    }    

    public static int fact(int n){
        
        if(n==1)
            return 1;
        
        else{
            return n*fact(n-1);
        }
    }
    

    
}


