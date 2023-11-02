
package fileprintwriter2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class FilePrintWriter2 {

    
    public static void main(String[] args) throws FileNotFoundException {
        
        File file=new File("C:\\Users\\user\\Desktop\\textfiles.txt");
        Scanner read=new Scanner(file);
        
        PrintWriter pw=new PrintWriter(file);
        
        pw.println("Hello java This is masud and updated");
        pw.close();
        
        
//        if (file.exists()){
//            System.out.println(read.nextLine());
//        }
//        else{
//            System.out.println("File is empty");
//        }

    }
}
