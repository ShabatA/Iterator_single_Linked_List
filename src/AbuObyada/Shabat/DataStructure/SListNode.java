package AbuObyada.Shabat.DataStructure;

/* SListNode.java */

/**
 *  SListNode is a class used internally by the SList class.  An SList object
 *  is a singly-linked list, and an SListNode is a node of a singly-linked
 *  list.  Each SListNode has two references:  one to an object, and one to
 *  the next node in the list.
 */

class SListNode <T> implements NodeInterface<T>{
  private T item;
  private SListNode next;

  /**
   *  SListNode() (with one parameter) constructs a list node referencing the
   *  item "obj".
   */

  SListNode(T obj) {
    item = obj;
    next = null;
  }

  /**
   *  SListNode() (with two parameters) constructs a list node referencing the
   *  item "obj", whose next list node is to be "next".
   */

  SListNode(T obj, SListNode next) {
    item = obj;
    this.next = next;
  }
   @Override
    public void setNext(SListNode n) {
        next = n;
    }

    @Override
    public SListNode getNext() {
        return next;
    }

    @Override
    public void setItem(T item) {
        this.item = (T) item;
    }

    @Override
    public T getItem() {
        return (T) item;
    }

  

}
