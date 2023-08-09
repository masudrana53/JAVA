
package question2;

import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {

//        Scanner input=new Scanner(System.in);
//        int number = input.nextInt();
        
        int number = 5;
        int result = 1;
        
        for (int i=1; i<=number; i++){
            result = result*i;
        }
        System.out.println("Factorial number is "+result);
  
        
    }
    
}


