
package multidimentionaltomethod;

import java.util.Arrays;
import java.util.Scanner;
import pack.TwoDArrayInMethod;


public class MultiDimentionalToMethod {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Enter row number: ");
        int row=input.nextInt();
        System.out.println("Enter column number: ");
        int col=input.nextInt();
        
        TwoDArrayInMethod tdaim = new TwoDArrayInMethod();
        
        int[][] newArray = tdaim.createArray(row, col);
        
        int sumOfArray = tdaim.doSum(newArray);
        System.out.println(sumOfArray);
        
        
        
//        int [][] numbers={{1,2,3,4},{5,6,7,8}};
//        int [][] marks={{10,20,30,40},{50,60,70,80}};
//        
//        System.out.println("Number is: "+tdaim.doSum(numbers));
//        System.out.println("Mark is: "+tdaim.doSum(marks));
        
        
        
//        int [] [] marck=new int [5][3];
//        for(int row=0; row<marck.length; row++){
//            for( int col=0; col<marck[row].length; col++){
//                marck[row][col]= (int)(Math.random()*100);
//            }
//        }
//        System.out.println(Arrays.deepToString(marck));
        
        
        
    }
    
}
