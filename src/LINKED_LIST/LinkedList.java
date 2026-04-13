package LINKED_LIST;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }

     Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
}
public class LinkedList {
    Node head;

    void insertAtBegin(int data){
        Node node = new Node(data);
        node.next = head;
        head = node;
    }

    void insertAtEnd(int data){
        Node node = new Node(data);
        if(head == null){
            insertAtBegin(data);
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
    }

    void insertAtPosition(int data, int pos){
        Node node = new Node(data);
        Node temp = head;
        if(pos == 1){
            insertAtBegin(data);
            return;
        }
        for(int i=1;i<pos-1 && temp != null;i++){
            temp = temp.next;
        }

        if(temp == null){
            return;
        }

        node.next = temp.next;
        temp.next = node;
    }
}
