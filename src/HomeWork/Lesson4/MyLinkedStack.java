package HomeWork.Lesson4;

public class MyLinkedStack<T> {
    private MyLinkedList<T> stack = new MyLinkedList<>();

    public int size() {
        return stack.getSize();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T value) {
        stack.addFirst(value);
    }

    public T pop() {
        return stack.removeFirst();
    }

    public T peek() {
        return stack.getFirst();
    }
}
