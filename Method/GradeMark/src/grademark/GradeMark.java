
package grademark;

import java.util.Scanner;
import pack.GradeClass;


public class GradeMark {


    public static void main(String[] args) {
        
        GradeClass gc = new GradeClass();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        int input = sc.nextInt();
        
        System.out.println(gc.mark(input));
    }
}
