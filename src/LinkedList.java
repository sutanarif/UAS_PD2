/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class LinkedList {
     LinkedListNode head;
    LinkedListNode tail;
    
    LinkedList(){
        this.head = null;
        this.tail = null;
        
    }
    
    void print(){ 
        LinkedListNode current = head;
        while(current != null){
            System.out.print(current.data + " ");
        current = current.next; 
        
        }
        System.out.println();
    }
    void push(LinkedListNode new_node){ 
        if(head == null){ 
            head = new_node; 
            tail = new_node;
        }
        else{
            
            
            tail.set_next(new_node); 
            tail = new_node;
            
        }
    }
   LinkedListNode qpop() {
        LinkedListNode taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken =head;
            head = null;
            tail = null;
        } else {
            taken = head;
            head = head.next;
        }
        return taken;
    }

    LinkedListNode spop() {
        LinkedListNode taken = null;
        if (this.head == null && this.tail == null) {
            taken = null;
        } else if (this.head == this.tail) {
            taken = tail;
            head = null;
            tail = null;
        } else {
            taken = tail;
            tail = tail.prev;
            tail.next = null;
            taken.prev = null;
        }
        return taken;
    }
    public void resetdata(){
        for(LinkedListNode x = head; x!= null;){
          LinkedListNode next = x.next;
          x.next = null;
          x.prev = null;
          x = next;
        }
        head = tail = null;
    }
}
