
package debuggingtest;

import java.util.Scanner;

public class DebuggingTest {

   
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);      
//        

        char ch = input.next().charAt(0);
//        if (ch >= 'A' && ch <= 'Z') {
//            System.out.println("Upper Case");
//        } else {
//            System.ouAt.println("Lower Case");
//        }
//////        
//
//
//
//        if (ch >= (char) 65 && ch <= (char) 92) {
//            System.out.println("Upper Case");
//        } else {
//            System.out.println("Lower Case");
//        }
//           
            
         
            
            if(ch>=(char)65 && ch<=(char)92){            
            System.out.println("Upper Case");
                System.out.println((int) ch);
                System.out.println(Integer.toBinaryString((int) ch));
        }
        
        else{
            System.out.println("Lower Case");
                System.out.println((int) ch);
                System.out.println(Integer.toBinaryString((int) ch));
        }
            
            

//            System.out.println(Character.toChars(125));
            
            
//            String name = "  Java";
//            System.out.println(name.length());
//            System.out.println(name.charAt(0));
//            System.out.println(name.trim());
//            
            
//            String message = "Welcome to java ";
//            System.out.println(message.substring(3)+ "HTML");
             
           
    }
    
}
