package HomeWork.Lesson5;

public class Item {
    public String name;
    public double weigth;
    public double price;

    public Item(String name, double weigth, double price) {
        this.name = name;
        this.weigth = weigth;
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getWeigth() {
        return weigth;
    }

    public double getPrice() {
        return price;
    }
}
