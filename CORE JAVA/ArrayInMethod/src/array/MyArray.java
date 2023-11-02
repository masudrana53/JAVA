
package array;


public class MyArray {
    
    public void findMaxMin(int [] numbers){
        int max=numbers[0];
              int min=numbers[0];
                     
              for(int number:numbers){
                  
                  max= number > max ? number : max;
                  min= number < min ? number : min;
            }
            
              System.out.println("Max is "+max+ " Min is "+min);
    }
    
    
    
    public void findElementInArray(int a, int[] myArray) {
        int val=0;
        for (int i=0; i<myArray.length; i++){
            
            val=myArray[i];
            if(val==a){
                System.out.println("Value found");
                break;
            }
        }
        
        if(val!=a){
            System.out.println("Value not Found");
        }
    }
}
