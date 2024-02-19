package linked_list;

public class Main {
    public static void main(String[] args) {
        Linked_List myLinkedList = new Linked_List(4);
        myLinkedList.printList();
        System.out.println();
        //myLinkedList.getHead();
        //myLinkedList.getTail();
        //myLinkedList.getLength();
        myLinkedList.append(6);
        myLinkedList.printList();
        System.out.println();
        //myLinkedList.getLength();
        System.out.println();
        /*System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());*/
        myLinkedList.prepend(7);
        System.out.println();
        myLinkedList.printList();
        /*System.out.println();
        System.out.println(myLinkedList.removeFirst().value);
        System.out.println(myLinkedList.removeFirst().value);*/
        System.out.println();
        System.out.println(myLinkedList.set(1,12));
        System.out.println(myLinkedList.insert(3,23));
        System.out.println();
        myLinkedList.printList();
        System.out.println();
        System.out.println(myLinkedList.remove(3));
        myLinkedList.printList();
        System.out.println();
        myLinkedList.reverse();
        myLinkedList.printList();
    }
}
