
package recurtioninfibonacci;

import java.util.Scanner;


public class RecurtionInFibonacci {


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("please enter number: ");
        int userInput=input.nextInt();
        System.out.println("Below the numbers of febonacci serious: ");
        
        
//        for(int i=0; i<=userInput; i++){
//            System.out.println(fibo(i)+ " ");
//        }
        
        System.out.println(fibo(userInput)+ " ");
    } 
     
    public static int fibo(int n){
        
        if (n==0){
            return 0;
        }
        
        else if(n==1){
            return 1;
        }
        
        else{
            return fibo(n-1)+fibo(n-2);
        }

    }
    
}
