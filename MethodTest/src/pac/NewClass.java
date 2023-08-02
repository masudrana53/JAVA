
package pac;


public class NewClass {
    
    public String prime(int input){
        
        int count = 0;
        for (int i=1; i<=input; i++){
            if (input%i == 0){
                count=count+1;
            }
        }
        
        if(count == 2){
        return "Prime Number";
        }
        else{
        return "Not Prime";
        }
    }
}


