public class Main {
    public static void main(String[] args) {
        SinglyLL list = new SinglyLL();

        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(7);
        list.insertLast(99);
        list.insert(100, 3);
        list.display();
        System.out.println(list.deleteFirst());
        list.insertRec(88, 2);
        list.display();
    }
}
