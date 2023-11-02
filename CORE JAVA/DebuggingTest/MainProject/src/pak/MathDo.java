/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pak;

/**
 *
 * @author user
 */
public class MathDo {
    
    public int PrimeOrNot(int num) {
      int count = 0;
      if(num == 0||num == 1) {
         count= 1;
      } else {
         for(int i = 2; i <= num/2; i++) {
            if(num % i == 0) {
               count = 1;
               break;
            }
         }
      }
      return count;

    }
    
    
}
