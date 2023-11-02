
package factorialnumber;

import java.util.Arrays;
import java.util.Scanner;


public class FactorialNumber {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
////        System.out.println("Enter number here");
////        int number = input.nextInt();
//
////        int result = 1;
////        for (int i = 1; i <= number; i++) {
////            result = result * i;
////        }
////        System.out.println("Factorial number is " + result);
//        
        

        
        //Find prime number 
//        int count=0;
//        for(int i=1; i<=number; i++){
//            if(number%i == 0){
//            count +=1;
//            }  
//        }
//        if (count == 2){
//            System.out.println("This is prime number");
//        }
//        else {
//            System.out.println("This is not prime");
//        }
        
        

        
        
        int[][] myArray = {{2, 8, 22}, {5, 69, 32, 65}, {85, 9}, {12, 90, 56, 35, 62},{65,2,58,3,962,45,3}};
           
        //Sort 2D_Array in Ascending Order
        for (int[] myArray1 : myArray) {
            for (int k = 0; k < myArray1.length - 1; k++) {
                for (int col = 0; col < myArray1.length - 1; col++) {
                    if (myArray1[col] > myArray1[col + 1]) {
                        int temp = myArray1[col];
                        myArray1[col] = myArray1[col + 1];
                        myArray1[col + 1] = temp;
                    }
                }
            }
        }
        System.out.println("Ascending 2DArray = " + Arrays.deepToString(myArray));
        
        
        
        
    }
    
}
