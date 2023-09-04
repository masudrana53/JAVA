
package queues;

import pack.PrintNumber;


public class TestThreads {

   
    public static void main(String[] args) {
        
        PrintNumber pn1=new PrintNumber("Masud");
        PrintNumber pn2=new PrintNumber("Rana");
        PrintNumber pn3=new PrintNumber("Hasan");
        PrintNumber pn4=new PrintNumber("Tamim");
        PrintNumber pn5=new PrintNumber("Sakib");
        
        Thread t1=new Thread(pn1);
        Thread t2=new Thread(pn2);
        Thread t3=new Thread(pn3);
        Thread t4=new Thread(pn4);
        Thread t5=new Thread(pn5);
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        
//        System.out.println("");
      
    }
    
}
