package ua.com.bpgdev.javabegins.queue;

import ua.com.bpgdev.javabegins.queue.implementations.ArrayQueue;

public class Application {
    public static void main(String[] args) {
        ArrayQueue arrayQueue = new ArrayQueue();

        arrayQueue.enqueue("A");
        arrayQueue.enqueue("B");
        arrayQueue.enqueue("C");
        arrayQueue.enqueue("D");
        arrayQueue.enqueue("E");


        System.out.println(arrayQueue.toString());
        System.out.println(arrayQueue.dequeue().toString());
        System.out.println(arrayQueue.dequeue().toString());
        System.out.println(arrayQueue.dequeue().toString());
        System.out.println(arrayQueue.toString());

        System.out.println(arrayQueue.toString());
        //        arrayQueue.enqueue("C");
//        arrayQueue.enqueue("B");
//        arrayQueue.enqueue("B");
//        arrayQueue.enqueue("D");
//        arrayQueue.enqueue("E");
/*        System.out.println(arrayQueue.toString());

        arrayQueue.remove("B");
        System.out.println(arrayQueue.toString());

        System.out.println(arrayQueue.dequeue().toString());
        System.out.println(arrayQueue.toString());
        arrayQueue.dequeue();
        System.out.println(arrayQueue.toString());
        arrayQueue.dequeue();
        System.out.println(arrayQueue.toString());
        arrayQueue.dequeue();*/

    }
}
