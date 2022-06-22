package LinkedList;

public class LinkedListPractice {
    public static void main(String[] args) {
        MyLinkedList fun = new MyLinkedList();
        fun.addAtIndex(0,10);
        fun.addAtIndex(0,20);
        fun.addAtTail(40);

        for(int i = 0; i < fun.getSize(); i++) {
            System.out.println(fun.get(i));
        }
    }
}
