package DoublyLinkedList;

public class DoublyLinkedListPractice {
    public static void main(String[] args) {
        DoublyLinkedList fun = new DoublyLinkedList();
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
