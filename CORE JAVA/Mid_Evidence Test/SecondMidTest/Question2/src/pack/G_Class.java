
package pack;


public class G_Class <DataType1, DataType2> {
    
    DataType1 VariableName1;
    DataType2 VariableName2;

    
    public G_Class(DataType1 VariableName1, DataType2 VariableName2) {
        this.VariableName1 = VariableName1;
        this.VariableName2 = VariableName2;
    }

    
    public void getMethod(){
        System.out.println(VariableName1);
        System.out.println(VariableName2);
    }
    

    
    
    
}
