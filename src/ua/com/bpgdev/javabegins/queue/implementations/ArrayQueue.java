package ua.com.bpgdev.javabegins.queue.implementations;

import ua.com.bpgdev.javabegins.queue.interfaces.Queue;

import java.util.Arrays;

public class ArrayQueue implements Queue {

    private Object[] array;
    private int size;

    private final int initialCapacity = 5;
    private final double growCoeficient = 1.5;


    public ArrayQueue() {
        array = new Object[initialCapacity];
    }

    @Override
    public void enqueue(Object value) {
        if (size == array.length) {
            Object[] newArray = new Object[(int) (array.length * growCoeficient)];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    @Override
    public Object dequeue() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Size of Queue = " + Integer.toString(size) + ". Maybe the Queue is empty.");
        }
        Object result;
        result = array[size - 1];
        array[size - 1] = null;
        size--;
        return result;
    }

    @Override
    public Object peek() {
        return array[size - 1];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean remove(Object value) {
        boolean result = false;
        for (int index = 0; index < size; index++) {
            if (array[index].equals(value)) {
                System.arraycopy(array, index + 1, array, index, size - index - 1);
                array[size - 1] = null;
                size--;
                index--;
                result = true;
            }
        }
        return result;
    }

    @Override
    public boolean contains(Object value) {
        for (int index = 0; index < size; index++) {
            if (array[index].equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object max() {
        return array[size - 1];
    }

    @Override
    public String toString() {
        return "ArrayQueue{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
