package data_contructures.mylist.thuchanh02;

public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("TESTING");
        MylinkedList ll = new MylinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);

        ll.add(4,9);
        ll.add(4,9);
        ll.add(7,5);
        ll.printList();
    }
}
