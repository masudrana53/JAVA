
package testfileclass;

import java.io.File;
import java.util.Date;


public class TestFileClass {

    
    public static void main(String[] args) {
        
        File file=new File("C:\\Users\\user\\Desktop\\textfiles.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
        System.out.println(file.isDirectory()); //figure out folder
        System.out.println(file.getAbsolutePath());
        System.out.println(new Date(file.lastModified()));
       
    }
    
}
