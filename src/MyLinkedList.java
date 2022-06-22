public class MyLinkedList {
    //definition for singly-linked list.
    public class SLLNode {
        int val; //value of the node
        SLLNode next; //reference to next node
        SLLNode(int val) {
            this.val = val;
        }
    }

    //instance variables for defining a linkedlist
    private int size = 0;
    private SLLNode head;

    public MyLinkedList() {

    }

    public int get(int index) { // gets a value from the i-th position in linked list
        if(index>=size){ //deals with invalid case
            return -1;
        }
        else{
            SLLNode curr = head; //initializes head as the current node
            for(int i = 0; i < index; i++){ //iterates through nodes until we reach desired node
                curr = curr.next;
            }
            return curr.val;
        }
    }

    public void addAtHead(int val) {
        /*
        This part tracks the old head node, updates to the new node, and then sets a reference back
        to the old head node and increases the size of the linkedlist
        */

        SLLNode prev = head;
        head = new SLLNode(val);
        head.next = prev;
        size++;
    }

    public void addAtTail(int val) {
        /*
        This part iterates through all nodes until the last node and then points a reference to the           new node at the tail and increases the size of the linkedlist
        */
        if(size==0){
            head = new SLLNode(val);
            size++;
        }
        else {
            SLLNode curr = head;
            for(int i = 0; i < size - 1; i++) {
                curr = curr.next;
            }
            curr.next = new SLLNode(val);
            size++;
        }
    }

    public void addAtIndex(int index, int val) {
        if(index==0) {
            addAtHead(val);
        }
        else if(index==size) {
            addAtTail(val);
        }
        else if(index<size) {
            SLLNode curr = head;
            for(int i = 0; i < index-1; i++){
                curr = curr.next;
            }
            SLLNode novel = new SLLNode(val);
            novel.next = curr.next;
            curr.next = novel;
            size++;
        }
    }

    public void deleteAtIndex(int index) {
        if(index>=size) {
            return;
        }
        else if(index==0) {
            head = head.next;
        }
        else {
            SLLNode curr = head;
            for(int i = 0; i < index - 1; i++) {
                curr = curr.next;
            }
            curr.next = curr.next.next;
        }
        size--;
    }

    public int getSize() {
        return size;
    }
}