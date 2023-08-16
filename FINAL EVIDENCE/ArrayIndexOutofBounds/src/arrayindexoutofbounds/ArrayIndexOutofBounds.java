
package arrayindexoutofbounds;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayIndexOutofBounds {

    
    public static void main(String[] args) {
        
        
//       Write a Java program that creates an array with 100 randomly chosen integers. 
//       It prompts the user for an index and displays the corresponding element value. 
//       If the index is out of bounds, it shows "Out of Bounds" with an exception handler.

         Scanner input = new Scanner(System.in);
         
         int[] myArray = new int[100];
         for(int i=0; i<myArray.length; i++){
             myArray[i] = (int)(Math.random()*100);
         }
         System.out.println(Arrays.toString(myArray));
         
         System.out.println("Pls enter your index number: ");
         int useInput = input.nextInt();
         
         try{
             int value = myArray[useInput];
             System.out.println("Your value is "+value);
         }
         
         catch(ArrayIndexOutOfBoundsException e){
             System.out.println(e);
         }
        
       
    }
    
}
