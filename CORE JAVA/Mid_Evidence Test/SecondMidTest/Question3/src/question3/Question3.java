
package question3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Question3 {

   
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File ("C:\\Users\\user\\Desktop\\evi_file.txt");
        Scanner read=new Scanner(file);
        
        PrintWriter pw=new PrintWriter(file);
        
        pw.println("This is text file for midtest");
        pw.close();
        
        
        if (file.exists()){
            System.out.println(read.nextLine());
        }
        else{
            System.out.println("File is empty");
        }
       
        
       
        
        
        
    }
    
}
