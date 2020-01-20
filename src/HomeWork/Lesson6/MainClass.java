package HomeWork.Lesson6;

public class MainClass {
    public static void main(String[] args) {
        MyDigitTree map = new MyDigitTree();

        for (int i = 0; i < 10; i++) {
            map.put((int) (Math.random()*200-100));
        }
        System.out.println(map);
        System.out.println(map.get(10));

    }
}
