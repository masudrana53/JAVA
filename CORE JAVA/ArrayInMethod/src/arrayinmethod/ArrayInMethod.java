
package arrayinmethod;

import array.MyArray;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayInMethod {

    
    public static void main(String[] args) {
       
        MyArray ma=new MyArray();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Array size ");
        int size=input.nextInt();
            
            
            int[] numbers=new int[size];
              for(int i=0; i<numbers.length; i++){
                numbers[i]=(int)(Math.random()*10);
        }
              ma.findMaxMin(numbers);

 
              
              System.out.println(Arrays.toString(numbers));
              ma.findElementInArray(5, numbers); 
    }      
}
