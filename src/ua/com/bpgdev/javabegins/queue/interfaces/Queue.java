package ua.com.bpgdev.javabegins.queue.interfaces;

public interface Queue {

    void enqueue(Object value);

    Object dequeue();

    Object peek();

    int size();

    boolean remove(Object value);

    boolean contains(Object value);

    Object max();

}
