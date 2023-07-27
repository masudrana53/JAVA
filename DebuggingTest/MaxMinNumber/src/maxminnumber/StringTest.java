
package maxminnumber;

import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.println("Ener item number");
        int n=input.nextInt();
        
        int max=0, min=999999999;
        int inputNumber=0;
        
        
        while(n>0){
            System.out.println("Enter number ");
            inputNumber= input.nextInt();
            if (max < inputNumber){
                max = inputNumber;
            }
            
            if (min > inputNumber){
                min = inputNumber;
            }
            n--; 
        }
        
        
        
        System.out.println("Maximum number is = "+max);
        System.out.println("Minimum number is = "+min);
        
    }
}
