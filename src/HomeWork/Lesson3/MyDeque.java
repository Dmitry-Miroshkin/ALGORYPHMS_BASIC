package HomeWork.Lesson3;

import java.util.EmptyStackException;

public class MyDeque<T> {
    public T[] list;
    private int size = 0;
    private final int DEFAULT_CAPACITY = 10;
    private int begin = 0;
    private int end = 0;

    public MyDeque(int capacity) {
        if (capacity <= 0) {
            throw new IllegalArgumentException("Capacity WRONG: " + capacity);
        }
        list = (T[]) new Object[capacity];
    }

    public MyDeque() {
        list = (T[]) new Object[DEFAULT_CAPACITY];

    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public boolean isFull() {
        return (end == list.length);
    }

    public void insertLeft(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        shihftToEnd();
        list[begin] = value;
        size++;
    }

    public void insertRight(T value) {
        if (isFull()) {
            throw new StackOverflowError();
        }
        list[end] = value;
        size++;
        end++;
    }

    public T removeLeft() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T temp = list[begin];
        shiftToBegin();
return temp ;
    }


    public T removeRight() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T temp = list[end - 1];
        list[end] = null;
        end--;
        size--;
        return temp;
    }

    private void shihftToEnd() {
        if (isFull()) {
            throw new StackOverflowError();
        } else {
            for (int i = end - 1; i >= begin; i--) {
                list[i + 1] = list[i];
            }
            end++;
        }
    }
    private void shiftToBegin(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        for (int i = begin+1; i < end ; i++) {
            list[i-1]= list[i];
            list[i]=null;
        }
        end--;
        size--;
    }
}
