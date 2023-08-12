package practiceprintwriter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class PracticePrintWriter {

    public static void main(String[] args) throws FileNotFoundException {

        File MyFile = new File("C:\\Users\\user\\Desktop\\textfilesssss.txt");
        Scanner read=new Scanner(MyFile);
        
        
        if (MyFile.exists()){
            String tenWords = "";
            int count = 1;
            while(read.hasNext()){
                String word=read.next();
                tenWords += word +" ";
                count++;
                if (count == 10){
                    System.out.println(tenWords);
                    count = 1;
                    tenWords = "";
                }
            }
            
        }else{
            System.out.println("File is empty");
        }
        read.close();

    }

}
