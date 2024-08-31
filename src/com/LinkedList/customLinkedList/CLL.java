package com.LinkedList.customLinkedList;

public class CLL {

    private  int size;

    private Node head;
    private Node tail;

    public CLL() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail= node;
            size++;
            return;

        }

        tail.next = node;
        node.next = head;
        tail = node;
        size++;

    }


    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }

        if(head == tail && head.val == val){
            head= null;
            tail= null;
            size--;
            return;
        }

        if(head == tail && head.val == val ){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        if (head.val == val) {
            // Deleting the head node
            head = head.next;
            tail.next = head;
            size--;
            return;
        }

        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                break;
            }
            node = node.next;
        } while( node != head);
        size--;
    }

    public void display(){
        if(head == null){
            return;
        }
        Node node = head;
//        while(node!=null)
        if(head != null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node != head);
            System.out.println("HEAD");
        }
    }



    public void size(){
        System.out.println(this.size);
    }

    private  class Node{
        private int val;
        private Node next;


        public Node(int val) {
            this.val = val;
        }
    }
}
