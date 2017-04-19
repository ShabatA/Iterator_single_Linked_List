/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbuObyada.Shabat.DataStructure;

/**
 *
 * @author STAFF-PC
 */
public interface NodeInterface <T>{
    //Change the next node reference
    public void setNext(SListNode n);
    //return a reference of the next node
    public SListNode getNext();
    //change the value on anode
    public void setItem(T item);
    //return the item from a particular node
    public T getItem();
    
    
}
