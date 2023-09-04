
package pack;


public class PrintNumber implements Runnable{
    
    public String LastNum;

   
    
    
    public PrintNumber() {
    }

    
    public PrintNumber(String LastNum) {
        this.LastNum = LastNum;
    }
    
    
    
    @Override
    public void run() {
        for(int i=1; i<=5; i++){
            System.out.println(i+" "+this.LastNum);
            System.out.println(" ");
        }

//    @Override
//    public void run() {
//        for(int i=1; i<=LastNum; i++){
//            System.out.println(" "+i);
//        }
    }
    
}
