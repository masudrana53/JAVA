
package binaryio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class BinaryIO {

    
    public static void main(String[] args) throws IOException {
        
        File file = new File("C:\\Users\\user\\Desktop\\testbinaryfile.dat");
        FileOutputStream outStream = new FileOutputStream(file);
        
        for (int i=1; i<=50; i++){
            outStream.write(i);
        }
        
        //For read
        FileInputStream inputStream = new FileInputStream(file);
        for(int i=1; i<=50; i++){
            System.out.println(inputStream.read());
        }
        
    }
    
}
