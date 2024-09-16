/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package labtask.linkedlist;

/**
 *
 * @author Abdul Waheed
 */
public class Linkedlist {
    
    public class Node{
    
    int data;
    Node next;
    
    Node(int data){
    
        this.data= data;
        this.next= null;
        
    }
    }
    
    private Node head;
    
    Linkedlist(){
    this.head= null;
    }
    
    public void insertAtStart(int data){
    
    Node newNode = new Node (data);
    
    newNode.next = head;
    head = newNode;
    
    }
    
    public void deleteAtStart(){
    
        
        if(head != null ){
        
          
    head = head.next;    
        }
        else{
            System.out.println("List is empty. Nothing is to delete.");
        }
  
    
    }
    public void display(){
        
        if(head== null){
        
            System.out.println("List is empty. ");
            return;
        }
        
    Node current= head;
    
    while(current!= null){
    
        System.out.print(current.data + " ->");
        current = current.next;
    }
    System.out.println("null");
    }
    
    public void deleteAtEnd(){
    
    if(head == null){
        System.out.println("List is empty.");
        return;
    }
    if (head.next == null){
    head =null;
    
    }else {
    Node current = head;
    
    
    while (current.next.next != null){
    current = current .next;
    }
    current.next = null;
    }
    }
    
    public void insertAtEnd(int data){
    
        Node newNode = new Node(data);
    if(head == null){
        head =newNode;
       
    }else{
    
    Node current =head;



    while (current.next != null){
    current = current.next;
    }
    current.next = newNode;
    }}
    
    
    public int size (){
    
        int size = 0;
        
        Node current = head;
        
        while (current != null){
        size++;
        current = current.next;
        
        }
        
    return size;
    }
    
    

    public static void main(String[] args) {
        Linkedlist list= new Linkedlist();
        
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtEnd(30);
        list.insertAtEnd(40);
        
        System.out.println("Linked List : ");
        list.display();
        
        System.out.println("Size of the List : " + list.size());
        
        
        
        list.deleteAtStart();
        System.out.println("After deleting at start: ");
        list.display();
        
        
        list.deleteAtEnd();
        System.out.println("After deleting at end: ");
        list.display();
          
        System.out.println("Size of the list: " + list.size());
                
       
        
        
    
    }
}
