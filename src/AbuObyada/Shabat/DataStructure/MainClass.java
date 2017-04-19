/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbuObyada.Shabat.DataStructure;

import java.util.Iterator;

/**
 *
 * @author Abuobayda Shabat
 */
public class MainClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        SListIteratorInterface<Integer> myList = new SList<Integer>();
        myList.addToFront(20);
        myList.addToBack(50);
        myList.addToFront(30);
        
        Iterator<Integer> mylistIterator = myList.getIterator();
        
        while(mylistIterator.hasNext())
        {
            System.out.println(mylistIterator.next());
        }
        
    }
    
}
