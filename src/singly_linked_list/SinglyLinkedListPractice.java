package singly_linked_list;

public class SinglyLinkedListPractice {
    public static void main(String[] args) {
        SinglyLinkedList fun = new SinglyLinkedList();
        fun.addAtIndex(0,1);
        fun.addAtTail(6);
        fun.addAtHead(15);
        fun.addAtIndex(2,21);
        fun.deleteAtIndex(1);

        for(int i = 0; i < fun.getSize(); i++) {
            System.out.println(fun.get(i));
        }
    }
}
