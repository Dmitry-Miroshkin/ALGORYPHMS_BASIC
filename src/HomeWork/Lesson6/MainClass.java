package HomeWork.Lesson6;

public class MainClass {


    public static void main(String[] args) {
        int notBalanced=0, balanced = 0;

        for (int j = 0; j < 20; j++) {
            MyDigitTree map = new MyDigitTree();

            for (int i = 0; i < 7; i++) {
                map.put((int) (Math.random() * 200 - 100));
            }
            System.out.println(map);
            System.out.println(map.get(map.root));
            System.out.println(map.height(map.root));

            if (map.isBalanced(map.root)){
                balanced++;
            System.out.println("Tree is balanced");}

            else{
            notBalanced++;
            System.out.println("Tree is not balanced");}
        }
        System.out.println("Сбалансированных "+ balanced);
        System.out.println("НЕ сбалансированных "+notBalanced);
        System.out.println("Процент Не сбалансированных : "+notBalanced/.2+"%");
    }
}
