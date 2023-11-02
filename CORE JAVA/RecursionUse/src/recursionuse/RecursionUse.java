
package recursionuse;

import java.util.Scanner;


public class RecursionUse {


    public static void main(String[] args) {
        
        
        
//        long result = factorial(5);
//        System.out.println(result);
//    }
//    
//    //Recursion Factorial
//    public static long factorial (int n){
//        
//        if(n>0){
//        System.out.println(n-1);
//        return n*factorial(n-1);
//        }
//        
//        else {
//            return 1;
//        }
//    }
    




    //Another way of factorial
//    int result = factorial(5);
//        System.out.println("Factorial is "+result);
//    
//    }
//    public static int factorial(int n){
//        
//        if(n==0)
//            return 1;
//        else{
//            return n*factorial(n-1);
//        }
//    }
    


    
    //Another way of factorial
    Scanner input=new Scanner(System.in);
        System.out.println("Please enter an number: ");
    int userInput=input.nextInt();
    
    int result = factorial(userInput);
        System.out.println("Factorial number is "+result);
    
    }
    public static int factorial(int n){
        if(n==0)
            return 1;
        
        else{
            return n*factorial(n-1);
        } 
    }
    



    
//    long result = fib(6);
//        System.out.println(result+" result ");
//    }
//    //Recursion fibonacci
//    public static int fib(int index){
//        if (index == 0){
//            return 0;
//        }
//        else if (index == 1){
//            return 1;
//        }
//        else{
//            System.out.println(fib(index-1)+fib(index-2));
//            return fib(index-1)+fib(index-2);
//        }
//    }
    
    
}
