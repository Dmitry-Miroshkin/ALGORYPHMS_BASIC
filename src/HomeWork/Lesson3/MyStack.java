package HomeWork.Lesson3;

import java.util.EmptyStackException;

public class MyStack<T> {
    private T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;

    public MyStack(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity WRONG: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyStack() {

        list = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (size == list.length);
    }

    public int size() {
        return size;
    }

    public void push(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[size] = value;
        size++;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list[size - 1];
    }

    public T pop() {
        T temp = peek();
        size--;
        list[size] = null;
        return temp;
    }
}

