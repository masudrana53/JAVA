
package inputmismatchexceptiondemo;

import java.util.InputMismatchException;
import java.util.Scanner;


public class InputMismatchExceptionDemo {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        boolean continueInput= true;
        
        do{
            try{
                System.out.println("Enter an enteger: ");
                int number=input.nextInt();
                
                //Using string
//                String number=input.nextLine();
                
                System.out.println("Then number entered is "+number);
                
                continueInput= false;
            }
            catch(InputMismatchException ex){
                System.out.println("Try again. (" + "Incorrect input: an integer is required)");
                input.nextLine();
            }
        }
            while (continueInput);
        }
    }
    

