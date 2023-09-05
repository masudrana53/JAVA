
package threadcooperation;

import java.util.concurrent.locks.ReentrantLock;


public class ThreadCooperation {

    
    public static void main(String[] args) {
        
        
    }
    
    public static class DepositTask implements Runnable{

        @Override
        public void run() {
            while(true){
            
            }
        }

    }
    
    public static class WithdrawTask implements Runnable{

        @Override
        public void run() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        
    }
 
    private static class Account(){
        private 
                static Lock lock=new ReentrantLock();
        }
    }

