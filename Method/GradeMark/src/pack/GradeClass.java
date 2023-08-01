
package pack;


public class GradeClass {
    
    public String mark(int mark){
        
        if(mark<=32){
            return "F";
        }
        else if(mark<=50){
            return "B";
        }
        else if(mark<=70){
            return "A";
        }
        else if (mark>=80 && mark<=100){
            return "A+";
        }
        else{
            return "Invalid";
        }
    } 
}
