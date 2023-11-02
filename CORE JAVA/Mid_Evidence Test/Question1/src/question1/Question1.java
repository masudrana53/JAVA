
package question1;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        int sum = 0;
        
        while(true){
            System.out.println("Enter positive number here: ");
            int num = input.nextInt();
            
            if (num < 0) {
                break;
            }
            
            if (num > 0) {
                sum += num;
            }
        }
        
        System.out.println("Sum of positive integers: " + sum);
        
        
        
        

    }
    
}
