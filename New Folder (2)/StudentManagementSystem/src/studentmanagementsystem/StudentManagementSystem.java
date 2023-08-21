
package studentmanagementsystem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import pack.Student;


public class StudentManagementSystem {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Student student = new Student();
        
        Student[] students={
            new Student("Rana", 21),
            new Student("Hasan", 22),
            new Student("Tamim", 25),
            new Student("Sakib", 27),
        };
        
        FileOutputStream fileoutput = new FileOutputStream("Student.dat");
        ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
        objectoutput.writeObject(students);
        
        FileInputStream fileinput = new FileInputStream("Student.dat");
        ObjectInputStream objectinput = new ObjectInputStream(fileinput);
        
        Student[] myStudent = (Student[]) objectinput.readObject();
        System.out.println(Arrays.toString(myStudent));
  
    }
}
