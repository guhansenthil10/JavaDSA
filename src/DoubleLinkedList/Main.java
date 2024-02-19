package DoubleLinkedList;

public class Main {
    public static void main(String[]args){
        DoubleLinkedList dll = new DoubleLinkedList(4);
        dll.printList();
        dll.getHead();
        dll.getTail();
        dll.append(6);
        dll.append(7);
        System.out.println();
        dll.printList();
//        System.out.println(dll.removeLast().value);
//        System.out.println(dll.removeLast().value);
//        System.out.println(dll.removeLast().value);
        System.out.println(dll.removeLast().value);
        System.out.println();
        dll.prepend(5);
        dll.printList();
//        System.out.println(dll.removeFirst().value);
//        System.out.println(dll.removeFirst().value);
//        System.out.println(dll.removeFirst().value);
//        System.out.println(dll.removeFirst());
        System.out.println();
        System.out.println(dll.insert(2,5));
        dll.printList();
        System.out.println();
        System.out.println(dll.remove(2).value);
    }
}
