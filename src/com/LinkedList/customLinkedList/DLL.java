package com.LinkedList.customLinkedList;

public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL() {
        this.size = 0;
        this.head = null;
        this.tail = null;
    }

    public void insertFirst(int val){
        if(size == 0 && head == null ){
            Node node = new Node(val);
            head = node;
            tail = node;
            size++;
            return;
        }

        Node node = new Node(val);
        node.next = head;
        node.prev= null;
        if(head != null){
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val){

        if(size == 0 && head == null){
            Node node = new Node(val);
            head = node;
            tail = node;
            size++;
            return;
        }

        Node node = new Node (val);
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = node;
        node.prev = last;
        tail = node;
        size++;

    }

    public void insertLastUsingTail(int val){
        Node node  = new Node(val);

        if(size == 0 && head == tail){
            head = node;
            tail = node;
            size++;
            return;
        }

        tail.next = node;
        node.prev = tail;
        tail = node;
        size++;
    }

    public void insertAt(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if(index == size){
            insertLast(val);
            return;
        }

        Node node = new Node(val);
        Node temp = get(index-1);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
        size++;
    }

    public int deleteFirst(){
        int val = head.value;
        if(head.next != null){
            head.next.prev = null;
        }
        head = head.next;
        if(head == tail){
            tail = null;
        }

        size--;

        return val;
    }

    public int deleteLast(){

        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        int val = last.value;

        if(head == last){
            head = null;
        }

        if(last.prev != null){
            last.prev.next = null;
        }
        last = last.prev;
        tail = last;

        size--;

        return val;
    }

    public int deleteLastUsingTail(){
        int val = tail.value;
        if(head==tail){
            head = null;
        }
        if(tail.prev != null){
            tail.prev.next = null;
        }
        tail = tail.prev;

        size--;
        return val;
    }

    public int deleteAt(int index){
        if(index == 0){
           return deleteFirst();
        }
        if(index == size){
           return deleteLast();
        }
        Node temp = get(index-1);
        int val = temp.next.value;
        temp.next = temp.next.next;
        temp.next.prev = temp;
        size--;
        return val;

    }

    public Node get( int index){
        Node node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        return node;
    }

    public void display(){
        Node node = head;
//        System.out.print("NULL <- ");
        while(node !=null){
            System.out.print(node.value + " -> ");
            node = node.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public  void displayReverseUsingHead(){
        Node node = head;
        Node last = null;
        while(node != null){
            last = node;
            node  = node.next;
        }

        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("NULL");
        System.out.println();


    }

    public void displayReverseUsingTail(){
        Node node = tail ;
        while(node!= null){
            System.out.print(node.value + " -> ");
            node = node.prev;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public void size(){
        System.out.println(this.size);
    }

    public void getHead(){
        System.out.println("Head :"+this.head.value);
    }

    public void getTail(){
        System.out.println("Tail :"+this.tail.value);
    }

    public Node find(int value){
        Node node = head;

        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;

    }

    public void insertAfter(int after, int val){
        Node p = find(after);
        if(p == null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        if(node.next != null){
            node.next.prev = p;
        }
        p.next = node;
        node.prev = p;
        if(p == tail){
            tail = node;
        }
        size++;


    }



    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
