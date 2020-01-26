package HomeWork.Lesson8;

public class Main {
    public static void main(String[] args) {
        ChainingHashMap<Integer, String> map = new ChainingHashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.delete(3);
        System.out.println(map.get(3));
        System.out.println(map);
        map.put(3, "three");
        System.out.println(map.get(3));
    }
}
