
package multidimantionalarray;

import java.util.Arrays;
import java.util.Scanner;


public class MultiDimantionalArray {

   
    public static void main(String[] args) {
        
//        int[][] matrix=new int[4][4];
//        matrix[0][0]=7;
//        matrix[0][1]=8;
//        matrix[0][2]=5;
//        
//        matrix[1][0]=1;
//        matrix[1][1]=4;
//        matrix[1][2]=9;
//        
//        matrix[2][0]=9;
//        matrix[2][1]=8;
//        matrix[2][2]=7;
//        
//        matrix[3][0]=1;
//        matrix[3][1]=1;
//        matrix[3][2]=2;
//        
//        
//      System.out.println(Arrays.deepToString(matrix));
//        
//        for(int i=0; i<4; i++){ //For row
//            for(int j=0; j<4; j++){ //For column
//                System.out.print(matrix[i][j]+" ");
//            }
//            System.out.println("");
//        }
        


        
//        Scanner input=new Scanner(System.in);
//        System.out.println("Enter row number");
//        int row=input.nextInt();
//        System.out.println("Enter column number");
//        int col=input.nextInt();
//        
//        int[][] matrix=new int [row][col];
//        
//        for(int i=0; i<row; i++){
//            for(int j=0; j<col; j++){
//                matrix[i][j]=(int)(Math.random()*100);
//                System.out.print(i+","+j+"= "+matrix[i][j]+ "      ");
//            }
//            System.out.println("");
//        }
        

        
//        System.out.println(Arrays.deepToString(matrix));


        int[][] triangleArray = new int[5][];
        triangleArray[0] = new int[5];
        triangleArray[1] = new int[4];
        triangleArray[2] = new int[3];
        triangleArray[3] = new int[2];
        triangleArray[4] = new int[1];
        
        for(int i=1; i<5; i++){
            for (int j=1; i<5; i++){
                System.out.println(triangleArray[i][j]+" ");
            }
            System.out.println("");
        }
        
        System.out.println(Arrays.deepToString(triangleArray));
        
             
    }
    
}
