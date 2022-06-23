package SinglyLinkedList;

class SinglyLinkedList {
    public class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }

    private int size;
    private Node head;//sentinel head node

    public SinglyLinkedList() {
        size = 0;
        head = new Node(0);
    }

    public int get(int index) {
        //first we check for invalid indices
        if(index < 0 || index >= size) {
            return -1;
        }
        //here we get the i-th node
        else {
            Node curr = head;
            for(int i = 0; i < index+1;i++) {
                curr = curr.next;
            }
            return curr.val;
        }
    }

    public void addAtHead(int val) {
        addAtIndex(0,val);
    }

    public void addAtTail(int val) {
        addAtIndex(size,val);
    }

    public void addAtIndex(int index, int val) {
        //an invalid index
        if(index>size) {
            return;
        }
        //valid index here
        else {
            Node curr = head;
            for(int i = 0; i < index; i++) {
                curr = curr.next;
            }
            Node toAdd = new Node(val); //the new node to be added
            toAdd.next = curr.next;
            curr.next = toAdd;
            size++; //we're increasing size by adding a node
        }
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) {
            return;
        }
        Node curr = head;
        for(int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
        size--; //because we are deleting a node
    }

    //getter method for size
    public int getSize() {
        return size;
    }

}