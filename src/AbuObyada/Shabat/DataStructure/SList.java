/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbuObyada.Shabat.DataStructure;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author STAFF-PC
 */
public class SList<T> implements SListIteratorInterface<T> {
    SListNode head;
    int numOfItem;
    
    SList(){
        head = null;
        numOfItem = 0;
    }

    @Override
    public void addToFront(T item) {
        head = new SListNode(item,head);
        numOfItem++;
    }

    @Override
    public T removeFront() {
        T value = null;
        if(!isEmpty()){
            value = (T) head.getItem();
            head = head.getNext();
        }
        numOfItem--;
        return value;
    }

    @Override
    public void addToBack(T item) {
        SListNode current = head;
        // we start with one because we don't want the 
        // current to become null before adding
        int cnt = 1;
        while(current!=null && cnt < numOfItem){
            current = current.getNext();
            cnt++;
        }
        
        if (current!=null){
            SListNode newNode = new SListNode(item);
            current.setNext(newNode);
            numOfItem++;
            
        }
        //when the list is empty
        else{
            addToFront(item);
        }
    }

    @Override
    public T removeBack() {
        T value = null;
        if(!isEmpty()){
            SListNode current = head;
            //to make sure the current will point to the node before the last node
            int cnt = 2;
            while(current!=null && cnt <numOfItem)
            {
                current = current.getNext();
                cnt++;
            }
            
            if(current!=null)
            {
                //current is pointing to the node before the last node
                value = (T) current.getNext().getItem();
                current.setNext(null);
            }  
        }
        numOfItem--;
        return value;
    }
    
    //return a reference for the target node

    @Override
    public SListNode contain(T target) {
        SListNode temp = null;
        SListNode current = head;
        while (current!=null){
            if(current.getItem().equals(target))
            {
                temp = current;
            }
            current = current.getNext();
           
        }
        return temp;
    }

    @Override
    public boolean isEmpty() {
        return head==null;
    }

    @Override
    public void clear() {
        head = null;
        numOfItem=0;
    }

    @Override
    public void display() {
        SListNode current = head;
        while(current!=null){
            System.out.println(current.getItem());
            current = current.getNext();
        }
    }

    @Override
    public int numOfItems() {
        return numOfItem;
    }

    @Override
    public Iterator<T> getIterator() {
        return new IteratorLinked();
    }

    private class IteratorLinked<T> implements Iterator<T> {
        private SListNode nextNode;
        private IteratorLinked()
        {
            nextNode = head;
        }
        public boolean hasNext()
        {
            return nextNode!=null;
        }
        public T next()
        {
            if (hasNext())
            {
                SListNode returnNode = nextNode;
                nextNode = nextNode.getNext();
                return (T) returnNode.getItem();
            }
            else 
                throw new NoSuchElementException("Ilegal call");
    }
}
    
}
