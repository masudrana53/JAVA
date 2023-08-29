
package testmap;

import java.util.HashMap;
import java.util.Map;


public class TestMap {


    public static void main(String[] args) {
        
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Masud",33);
        hashMap.put("Rana", 25);
        hashMap.put("Hasan", 28);
        hashMap.put("Tameem", 52);
        
       
        System.out.println("Display entries in hashMap");
        System.out.println(hashMap +"\n");
        
    }
    
}
