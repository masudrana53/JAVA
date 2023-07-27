
package maxminnumber;

import java.util.Scanner;


public class FindPrimeNumber {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int userInput=input.nextInt();
        
        int count=0;
        for(int i=1; i<=userInput; i++){
            if(userInput %1==0){
                count +=1;
            }
        }
        // end for loop
        
        
        if(count==2){
            System.out.println("This is prime number ");
        }
        else{
            System.out.println("This is not prime number ");
        }
        
            
           //Find price number Between any number
           System.out.println("Starting point ");
           int number1 = input.nextInt();
           System.out.println("Ending point ");
           int number2 = input.nextInt();
           
           for( int i=number1; i<=number2; i++){
               
               int counter=0;
               
               for(int p=1; p<=i; p++){
                   if(i%p == 0){
                       counter+=1;
                   } 
               }
               if(counter==2){
                   System.out.println("prime is "+i);
               }
               
               else{
                   System.out.println("Not prime is "+i);
               }
           }
           


//        //Find factorial number
        System.out.println("Enter a number ");
        int userNumber=input.nextInt();
        
        int result = 1;
        for(int i=1; i<=userNumber; i++){
            result = result*i;  
        }
        System.out.println("Factorial number is "+result);
        

        
        //Find fibonacci number
        System.out.println("Enter no of fabonaccy series ");
        int useInput = input.nextInt();
        
        int n1=0, n2=1, sum=0;
//        System.out.println(n1+" "+n2);
        System.out.println(n1);
        System.out.println(n2);
        
        for (int i=3; i<=useInput; i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;                   
        }

    }
}

