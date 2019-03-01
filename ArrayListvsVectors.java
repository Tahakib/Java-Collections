/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ap;

import java.util.ArrayList;
import java.util.Vector;

/**
 *
 * @author Taha
 */
public class ArrayListvsVectors {
    public static void main(String[] args) 
                        
    { 
        //FOR ARRAY LIST--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
        // size of ArrayList 
        int n = 5; 
  
        //declaring ArrayList with initial size n 
        ArrayList<Integer> arrli = new ArrayList<Integer>(n); 
  
        // Appending the new element at the end of the list 
        for (int i=1; i<=n; i++) 
            arrli.add(i); 
  
        // Printing elements 
        System.out.println(arrli); 
  
        // Remove element at index 3 
        arrli.remove(3); 
  
        // Displaying ArrayList after deletion 
        System.out.println(arrli); 
  
        // Printing elements one by one 
        for (int i=0; i<arrli.size(); i++) 
            System.out.print(arrli.get(i)+" "); 
        
        
        //FOR VECTORS--------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
       // --------------------------------------------------------------------------------
        //--------------------------------------------------------------------------------
             // create default vector 
        Vector v = new Vector(); 
  
        v.add(1); 
        v.add(2); 
        v.add("geeks"); 
        v.add("forGeeks"); 
        v.add(3); 
  
        System.out.println("Vector is " + v); 
    } 
}
