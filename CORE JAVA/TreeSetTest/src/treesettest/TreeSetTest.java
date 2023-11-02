
package treesettest;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class TreeSetTest {

  
    public static void main(String[] args) {
       
        Set<String> set=new HashSet<>();
        
        set.add("Masud");
        set.add("Rana");
        set.add("Hasan");
        set.add("Rajib");
        set.add("Rajib");
        
        TreeSet<String> treeSet=new TreeSet<>(set);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        
    }
    
}
