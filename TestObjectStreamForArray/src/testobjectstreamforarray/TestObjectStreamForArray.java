/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testobjectstreamforarray;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author user
 */
public class TestObjectStreamForArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int [] numbers={10,20,30,40,50};
        String[] gretings={"Hello", "Welcome", "Bye", "Good Night"};
        
        
        
        try {
            FileOutputStream fileouputstream = new FileOutputStream("C:\\Users\\user\\Desktop\\testfile.dat");
            
            ObjectOutput objectoutput = new ObjectOutputStream(fileouputstream);
            
            objectoutput.writeObject(numbers);
            objectoutput.writeObject(gretings);
  
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        }
        catch (IOException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        }
                
         
        
        
        try {
           FileInputStream fileInputstream = new FileInputStream("C:\\Users\\user\\Desktop\\testfile.dat");
            ObjectInputStream inputstream = new ObjectInputStream(fileInputstream);
            
            int [] newNumbers = (int[]) inputstream.readObject();
            String[] newGretings = (String[]) inputstream.readObject();
            
            System.out.println(Arrays.toString(numbers));
            System.out.println(Arrays.toString(newGretings));
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TestObjectStreamForArray.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
    }
    
}
