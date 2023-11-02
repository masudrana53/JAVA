/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package selection;

import static java.util.Collections.list;
import java.util.LinkedList;

/**
 *
 * @author user
 */
public class LinkedList {

    
    public static void main(String[] args) {
       
        LinkedList<String> linkedList=new LinkedList<>();
        
        linkedList.add("Dhaka");
        linkedList.add("Mirpur");
        linkedList.add(2, "Badda");
        linkedList.add(3, "Gulshan");
        
        System.out.println(linkedList);
        
        for( String value: linkedList){
            System.out.println(value);
        }
        
    }  
}
