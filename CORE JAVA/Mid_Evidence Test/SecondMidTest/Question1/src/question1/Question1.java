
package question1;

import java.util.Scanner;


public class Question1 {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        int userInput=input.nextInt();
        
        int result = factorial(userInput);
        System.out.println("Factorial is "+result);
        
    }   
       
    public static int factorial(int n){
          if(n==1)
              return 1;
          
          else{
              return n*factorial(n-1);
          }
        }
}
