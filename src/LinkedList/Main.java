package LinkedList;

public class Main {
    public static void main(String[] args) {
//        SinglyLL list = new SinglyLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(99);
//        list.insert(56,3);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        System.out.println(list.find(5));

//        DoublyLL list = new DoublyLL();
//        list.insertFirst(3);
//        list.insertFirst(5);
//        list.insertFirst(6);
//        list.insertLast(99);
//        list.insertAfter(6,45);
//        list.display();

          CircularLL list = new CircularLL();
          list.insert(23);
          list.insert(45);
          list.insert(232);
          list.insert(54);
          list.display();
          list.delete(45);
          list.display();
    }
}
