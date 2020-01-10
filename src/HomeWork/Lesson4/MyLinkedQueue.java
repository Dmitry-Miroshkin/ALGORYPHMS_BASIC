package HomeWork.Lesson4;

public class MyLinkedQueue<T> {
    private MyLinkedList<T> queue = new MyLinkedList<>();

    public int size(){
        return queue.getSize();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public void enqueue(T value){
        queue.addFirst(value);
    }

    public T dequeue(){
        return queue.removeLast();
    }

    public T peek(){
        return queue.getLast();
    }
}

