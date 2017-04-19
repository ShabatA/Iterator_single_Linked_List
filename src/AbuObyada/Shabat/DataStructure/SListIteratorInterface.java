/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbuObyada.Shabat.DataStructure;

import java.util.Iterator;

/**
 *
 * @author STAFF-PC
 */
public interface SListIteratorInterface<T> extends SListInterface<T> {
    public Iterator<T> getIterator();
    
}
