
package arraytest;

import java.util.Arrays;
import java.util.Scanner;




public class ArrayTest {

    
    public static void main(String[] args) {
        
        String[] studentNames=new String[10];
        studentNames[0]="Rajib";
        studentNames[1]="Limon";
        studentNames[2]="Limon";
        studentNames[3]="Limon";
        studentNames[4]="Limon";
        studentNames[5]="Limon";
        studentNames[6]="Limon";
        studentNames[7]="Limon";
        studentNames[8]="Limon";
        studentNames[9]="Limon";
        
        int[] marks=new int[10];
        marks[0]=20;
        marks[1]=30;
        marks[2]=40;
        marks[3]=50;
        marks[4]=60;
        marks[5]=70;
        marks[6]=80;
        marks[7]=90;
        marks[8]=100;
        marks[9]=110;
        
//        System.out.println(Arrays.toString(studentNames));
//        System.out.println(Arrays.toString(marks));
//        System.out.println(studentNames[0]);
        
//        for(int i=0; i<studentNames.length; i++){
//            System.out.println(studentNames[i]);
//        }

//          for (int mark : marks){
//              System.out.println(mark);
//          }
//          
//          for(String name : studentNames){
//          System.out.println(name);
//          }

//            for(int i=0; i<studentNames.length; i++){
//                System.out.println("Student name is "+studentNames[i]+" and mark is "+marks[i]);
//            }
            
            
//            String[] subjects= {"JEE", "HTML", "GAVE", "CSS", "JSP"};
//            System.out.println(Arrays.toString(subjects));
            
            
    
            
//            int[] numbers=new int[10];
//            for(int i=0; i<numbers.length; i++){
//            numbers[i]=(int)(Math.random()*100); 
//            }
//            System.out.println(Arrays.toString(numbers));
            

              // Find 10 random numbers
//            int[] numbers=new int[10];
//            for(int i=0; i<numbers.length; i++){
//                numbers[i]=(int)(Math.random()*100);
//            }
//            for(int number:numbers){
//                System.out.println(number);
//            }
            
            

        //Find avg and sum number for random number
//            int sum=0;
//              int[] numbers=new int[10];
//              for(int i=0; i<numbers.length; i++){
//                numbers[i]=(int)(Math.random()*100);
//            }
//            for(int number:numbers){
//                sum+=number;
//                System.out.println(number+" ");
//            }
//            System.out.println("Sum is "+sum);
//            System.out.println("Average number is "+sum/numbers.length);
            
            
            
            
            //find max min number
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Array size ");
            int size=input.nextInt();
            
            
            int[] numbers=new int[size];
              for(int i=0; i<numbers.length; i++){
                numbers[i]=(int)(Math.random()*100); 
              }

              int max=numbers[0];
              int min=numbers[0];
                     
              for(int number:numbers){
                  
                  max= number > max ? number : max;
                  min= number < min ? number : min;
            }
            
              System.out.println(Arrays.toString(numbers));
              
              System.out.println("Max is "+max+ " Min is "+min);
            
            
            
       
          
    }
}
