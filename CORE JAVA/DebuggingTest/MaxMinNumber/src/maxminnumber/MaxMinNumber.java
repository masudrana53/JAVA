
package maxminnumber;

import java.util.Scanner;


public class MaxMinNumber {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Enter first number: ");
        int number1 = input.nextInt();
        System.out.println("Enter second number: ");
        int number2 = input.nextInt();
        System.out.println("Enter third number: ");
        int number3 = input.nextInt();

        int MaxNumber=0, MinNumber=0;
        
        
        //Find max number
        if (number1>number2 && number1>number3){
            MaxNumber = number1;
        }
        else if (number2>number1 && number2>number3){
            MaxNumber = number2;
        }
        else{
            MaxNumber = number3;
        }
        
        
        //Find min number
        if(number1<number2 && number1<number3){
            MinNumber = number1;
        }
        else if(number2<number1 && number2<number3){
            MinNumber = number2;
        }
        else{
            MinNumber = number3;
        }
        
        System.out.println("Maximun number = "+MaxNumber);
        System.out.println("Minimum number = "+MinNumber);
        
    }
}
