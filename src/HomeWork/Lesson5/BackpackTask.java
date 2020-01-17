package HomeWork.Lesson5;

import java.util.ArrayList;

public class BackpackTask {


    static ArrayList<Item> items;

    static void AddItems() {
        ArrayList<Item> items = new ArrayList<>();

        items.add(new Item("Книга", 1, 600));
        items.add(new Item("Бинокль", 2, 5000));
        items.add(new Item("Аптечка", 4, 1500));
        items.add(new Item("Ноутбук", 2, 40000));
        items.add(new Item("Котелок", 1, 500));
    }

    private static String ShowItems(ArrayList<Item> _items) {
        StringBuilder sb = new StringBuilder("[ ");
        for (Item i : _items) {
            sb.append(i.name + ", " + Double.toString(i.weigth) + ", " + Double.toString(i.price));
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append(" ]");
        return sb.toString();
    }

    private static void Solve() {
        Backpack bp = new Backpack(8);

        bp.MakeAllSets(items);
        System.out.println(items.isEmpty());
        ArrayList<Item> solve = bp.GetBestSet();

        if (solve.isEmpty()) {
            System.out.println("Нет решения!");
        } else {
            ShowItems(solve);
        }
    }

    public static void main(String[] args) {
        AddItems();
        ShowItems(items);

        Solve();
    }
}