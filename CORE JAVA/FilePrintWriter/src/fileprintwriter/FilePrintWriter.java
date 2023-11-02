package fileprintwriter;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FilePrintWriter {

    public static void main(String[] args) throws FileNotFoundException{
        

        File file = new File("C:\\Users\\user\\Desktop\\textfiles.txt");
        Scanner read = new Scanner(file);
        PrintWriter pw = null;
        
        String text =read.nextLine();
        System.out.println(text);

    }

}
