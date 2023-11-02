
package arrayoutofbounds;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayOutOfBounds {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int[] myArray = new int[100];
        for(int i=0; i<myArray.length; i++){
            myArray[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(myArray));
        
        System.out.println("Please enter your index number: ");
        int userInput = input.nextInt();
        
        try{
            int value = myArray[userInput];
            System.out.println("Value is "+value);
        }
        
        catch(ArrayIndexOutOfBoundsException p){
            System.out.println(p);
        }
        
       
    }
    
}
