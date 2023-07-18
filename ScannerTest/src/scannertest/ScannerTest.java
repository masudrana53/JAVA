
package scannertest;

import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      
        
        //Input 5 number and sum these numbers
//        int sum=0;
//        
//        for (int i=1; i<=5; i++){          
//        int number = sc.nextInt();
//        sum += number;
//        }
//            System.out.println("This is total "+sum);

           
            
           //Input element number and show them also make these sum
           System.out.println("Pls enter element number; ");
           int n = sc.nextInt();
           
           int sum = 0;
           
           for (int i=1; i<=n; i++){
                int number = sc.nextInt();
                sum +=number;
           }
                System.out.println(sum);
                 
                                
        
//        
//        String grettings;
//        System.out.println("Pls enter grettings; ");
//        grettings=sc.nextLine();
//        
//        System.out.println(grettings + " Java");
//            ......end grettings........

         
//          int n1, n2;
//          System.out.println("Pls enter number 1 ");          
//          n1=sc.nextInt();
//          
//          System.out.println("Pls enter number 2 ");
//          n2=sc.nextInt();
//          
//          int result=n1*n2;
//          System.out.println("The total of two number is "+result);
//                    ......end calculation........

            
//            int number, sum=0;
//            for(int i=1; i<=10; i++){
//                System.out.println("pls enter number "+i);
//                number=sc.nextInt();
//                sum +=number;  // sum=sum+number
//            }           
//            System.out.println("Total is "+ sum);
//                    ......end for loop........



//        Scanner input=new Scanner(System.in);
//        
//            System.out.print("Enter a number for radius: ");
//            double radius = input.nextDouble();
//        
//            double area = radius * radius * 3.14159;
//            
//            System.out.println("The area for the circle of radius " + radius + " is " + area);
                
    }    
}
