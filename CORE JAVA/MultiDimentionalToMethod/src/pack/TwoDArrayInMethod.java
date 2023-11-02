
package pack;


public class TwoDArrayInMethod {
    
    public int [][] createArray (int row, int column){
    int [][] myArray= new int[row][column];
    
    for(int ro=0; ro<myArray.length; ro++){
       for(int col=0; col<myArray[ro].length; col++){
           myArray[ro][col] = (int)(Math.random()*100);
       } 
        
    }
    return myArray;
}
    
    
    
    
    
    
    public int doSum(int[][] myArray){
        
        int total=0;
        for(int row=0; row<myArray.length; row++){
            for(int column=0; column<myArray[row].length; column++){
                total+= myArray[row][column];
            }
        }
        return total;
   } 
}
