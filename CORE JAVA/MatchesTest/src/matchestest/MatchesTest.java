
package matchestest;

import java.util.Scanner;


public class MatchesTest {

    
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        System.out.println("Pls enter ur cell number like +880-19-37420091");
        
        
        
        
        
        
        String number= "880-19-37420091";
        System.out.println(number.matches("\\d{3}-\\d{2}-\\d{8}"));
        
        String numbers= "+880-19-37420091";
        System.out.println(numbers.matches("\\[+]d{3}-\\{d2}-\\{d8}"));
        
        
        
        
        
        
        
        
    }
    
}
