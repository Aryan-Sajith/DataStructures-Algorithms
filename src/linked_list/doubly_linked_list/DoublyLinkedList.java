package linked_list.doubly_linked_list;

class DoublyLinkedList {
    public class Node {
        int val;
        Node next, prev;
        Node(int val) {
            this.val = val;
        }
    }

    private int size;
    private Node head,tail;//sentinel head & tail nodes

    public DoublyLinkedList() {
        size = 0;
        head = new Node(0);
        tail = new Node(0);
        head.next = tail;
        tail.prev = head;
    }

    public int get(int index) {

        if(index < 0 || index >= size) { //first we check for invalid indices
            return -1;
        }

        else if(index + 1 < size - index) { //this checks whether we are closer to the head node
            Node curr = head;
            for(int i = 0; i < index + 1; i++) {
                curr = curr.next;
            }
            return curr.val;
        }
        else { //this part means that we are closer to the tail node
            Node curr = tail;
            for(int i = 0; i < size-index; i++) {
                curr = curr.prev;
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
        //valid indices here
        Node before, after;
        if(index < size-index) { //we are closer to the head node
            before = head;
            for(int i = 0; i < index; i++) {
                before = before.next;
            }
            after = before.next;
        }
        else { //we are closer to the tail node
            after = tail;
            for(int i = 0; i < size - index; i++) {
                after = after.prev;
            }
            before = after.prev;
        }

        /*here we insert the new node after finding the correct surrounding nodes... also increment           the size
         */
        Node toAdd = new Node(val);
        toAdd.prev = before;
        toAdd.next = after;
        before.next = toAdd;
        after.prev = toAdd;
        size++;
    }

    public void deleteAtIndex(int index) {
        if(index < 0 || index >= size) { //invalid indices to we don't do anything
            return;
        }
        Node before, after;
        if(index < size-index) { //this part indicates we are closer to the head node
            before = head;
            for(int i = 0; i < index; i++) {
                before = before.next;
            }
            after = before.next.next;
        }
        else { //this part indicates that we are closer to the tail node
            after = tail;
            for(int i = 0; i < size-index-1; i++) {
                after = after.prev;
            }
            before= after.prev.prev;
        }

        //actual deletion of node after finding out the surrounding nodes
        before.next = after;
        after.prev = before;
        size--; // we also decrement the size because yea
    }
    public int getSize() {
        return size;
    }
}
