
package studentmanagement;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import pack.Student;



public class StudentManagement {


    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        
        Student student = new Student();
        
        Student[] students={
            new Student("Masud", 20),
            new Student("HASAN", 16),
            new Student("Tuhin", 25),
        };
        
        
        FileOutputStream fileOutputStream = new FileOutputStream("Student.dat");
        ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileOutputStream);
        objectoutputstream.writeObject(students);
        
        
        
        FileInputStream fileInputStream = new FileInputStream("Student.dat");
        ObjectInputStream objectinputstream = new ObjectInputStream(fileInputStream);
        
        Student[] newStudents = (Student[]) objectinputstream.readObject();
        System.out.println(Arrays.toString(newStudents));
        
        
    }
    
}
