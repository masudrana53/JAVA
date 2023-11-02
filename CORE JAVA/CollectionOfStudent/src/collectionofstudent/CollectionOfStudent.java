
package collectionofstudent;

import java.util.ArrayList;
import pack.Student;


public class CollectionOfStudent {


    public static void main(String[] args) {
        
        ArrayList<Student> students=new ArrayList<Student>();   
        students.add(new Student(100, "Masud", "01937420091", "masud@gmail"));
        
        System.out.println(students);
    }
}
