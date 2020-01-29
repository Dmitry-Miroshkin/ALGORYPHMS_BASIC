package HomeWork.Lesson3;

public class StringReverse {
    private String s;

    public StringReverse(String s) {
        this.s = s;
    }

    public String strReverse() {
        MyStack<Character> stack = new MyStack<>(s.length());
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            stack.push(ch);

        }
        String strout = "";
        for (int i = 0; i < s.length(); i++) {
            strout = strout + (stack.pop());
        }
        return strout;
    }
}
