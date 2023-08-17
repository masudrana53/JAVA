
package studentsmanagemes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import pack.Student;




public class StudentsManagemes {

    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        Student student = new Student();
        
        Student[] students={
            new Student("Masud", 25),
            new Student("Rana", 20),
            new Student("Tamim", 60),
            new Student("Messi", 38),
        };
        
        FileOutputStream fileoutput = new FileOutputStream("Student.dat");
        ObjectOutputStream objectoutput = new ObjectOutputStream(fileoutput);
        objectoutput.writeObject(students);
        
        FileInputStream fileinput = new FileInputStream("Student.dat");
        ObjectInputStream objectinput = new ObjectInputStream(fileinput);
        
        Student [] newStudent = (Student[]) objectinput.readObject();
        System.out.println(Arrays.toString(newStudent));
         
        
    }
    
}
