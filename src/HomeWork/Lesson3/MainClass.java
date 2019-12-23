package HomeWork.Lesson3;

public class MainClass {
    public static void main(String[] args) {

        MyStack<Integer> stack = new MyStack<>();
        for (int i = 0; i < 5; i++) {
            stack.push(i + 1);
        }
        System.out.println("stack.size: " + stack.size());
        for (int i = 0; i < 5; i++) {
            System.out.println(stack.pop());
        }

        System.out.println(stack.isEmpty());
        String str = "GeekBrains";
        StringReverse st = new StringReverse(str);
        System.out.println(st.strReverse());

        MyQueue<Integer> queue = new MyQueue<>();
        for (int i = 1; i < 6; i++) {
            queue.insert(i);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(queue.remove());
        }

        MyDeque <Integer> deque = new MyDeque<>();{
            for (int i = 1; i < 10; i++) {
                deque.insertRight(i);
            }
            for (int i = 0; i < 9; i++) {
                System.out.println(deque.removeRight());
                ;
            }
        }
    }
}
