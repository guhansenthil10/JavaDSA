package queue;

public class Main {
    public static void main(String[]args){
        Queue qe = new Queue(7);
        qe.getFirst();
        qe.getLast();
        qe.printQueue();
        qe.getLength();
        System.out.println();
        qe.enqueue(8);
        qe.printQueue();
        System.out.println(qe.dequeue().value);
        System.out.println(qe.dequeue().value);
        System.out.println(qe.dequeue());
    }
}
