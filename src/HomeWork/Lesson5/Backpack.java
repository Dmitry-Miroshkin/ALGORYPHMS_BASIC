package HomeWork.Lesson5;

import java.util.ArrayList;

public class Backpack {
    private ArrayList<Item> bestItems = null;

    private double maxW;

    private double bestPrice;

    public Backpack(double maxW) {
        this.maxW = maxW;
    }

    public void MakeAllSets(ArrayList<Item> items) {
        if (!items.isEmpty())
            CheckSet(items);

        for (int i = 0; i < items.size(); i++) {
            ArrayList<Item> newSet = new ArrayList<>(items);

            newSet.remove(i);

            MakeAllSets(newSet);
        }

    }

    //проверка, является ли данный набор лучшим решением задачи
    private void CheckSet(ArrayList<Item> items) {
        if (bestItems == null) {
            if (CalcWeigth(items) <= maxW) {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        } else {
            if (CalcWeigth(items) <= maxW && CalcPrice(items) > bestPrice) {
                bestItems = items;
                bestPrice = CalcPrice(items);
            }
        }
    }

    //вычисляет общий вес набора предметов
    private double CalcWeigth(ArrayList<Item> items) {
        double sumW = 0;
        for (Item i : items) {
            sumW += i.weigth;
        }
        return sumW;
    }

    //вычисляет общую стоимость набора предметов
    private double CalcPrice(ArrayList<Item> items) {
        double sumPrice = 0;
        for (Item i : items) {
            sumPrice += i.price;
        }
        return sumPrice;
    }

    //возвращает решение задачи (набор предметов)
    public ArrayList<Item> GetBestSet()
    {
        return bestItems;
    }
}
