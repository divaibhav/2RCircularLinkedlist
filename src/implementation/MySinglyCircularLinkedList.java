package implementation;

import myinterface.SinglyCircularLinkedListADT;

public class MySinglyCircularLinkedList implements
        SinglyCircularLinkedListADT {
    //only keeping tail reference
    private Node tail;
    //to keep number of nodes
    private int size;


    @Override
    public void addFirst(int element) {
        Node node = new Node(element);
        if(isEmpty()){
            tail = node;
            //setting circular behaviour
            node.setNext(node);
        }
        else{
            node.setNext(tail.getNext());
            tail.setNext(node);
        }
        size++;
    }

    @Override
    public void addLast(int element) {
        Node node = new Node(element);
        if(isEmpty()){
           addFirst(element);
        }
        else{
            node.setNext(tail.getNext());
            tail.setNext(node);
            tail = node;
            size++;
        }
    }

    @Override
    public int removeFirst() {
        int response = 0;
        if(!isEmpty()){
            Node firstNode = tail.getNext();
            if(firstNode == tail){
                tail = null;
            }
            else{
                tail.setNext(firstNode.getNext());
            }
            size--;
            response = firstNode.getData();
        }


        return  response;
    }

    @Override
    public boolean isEmpty() {
        return tail == null;
    }

    @Override
    public int size() {
        return size;
    }
    public void traverse(){
        if(!isEmpty()){
            Node temp = tail.getNext();
            while(temp != tail){
                System.out.print(temp.getData() + ", ");
                temp = temp.getNext();
            }
            //tail data is not printed in while loop
            System.out.println(temp.getData());
        }
    }

    public int sizeByTraverse(){
        int count = 0;
        if(!isEmpty()){
            Node temp = tail.getNext();
            while(temp != tail){
                count++;
                temp = temp.getNext();
            }
            //tail is not counted in while loop
            count++;
        }
        return count;
    }
}
