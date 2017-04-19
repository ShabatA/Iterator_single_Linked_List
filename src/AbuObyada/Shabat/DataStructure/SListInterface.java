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
public interface SListInterface<T> {
    public void addToFront(T item);
    public T removeFront();
    public void addToBack(T item);
    public T removeBack();
    public SListNode contain(T target);
    public boolean isEmpty();
    public void clear();
    public void display();
    public int numOfItems();
    
}
