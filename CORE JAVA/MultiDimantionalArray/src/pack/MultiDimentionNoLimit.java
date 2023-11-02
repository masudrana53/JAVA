
package pack;

import java.util.Arrays;


public class MultiDimentionNoLimit {
    
    public static void main(String[] args) {
        
        int[][] matrix={{10,20,30}, {15,50,30}, {20,60,50}};
        
        
        
        System.out.println(Arrays.deepToString(matrix));
        
        for(int i=0; i<3; i++){ //For row
            for(int j=0; j<3; j++){ //For column
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    
    }
}
