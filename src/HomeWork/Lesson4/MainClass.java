package HomeWork.Lesson4;

public class MainClass {
    public static void main(String[] args) {
//        MyLinkedList list = new MyLinkedList();
//        list.addFirst("Berty");
//        list.addFirst("Clair");
//        list.addFirst("Stuart");
//        System.out.println(list);
//        System.out.println(list.getFirst());
//        System.out.println(list.getLast());
//        System.out.println(list.getSize());
//        System.out.println(list.iterator().next());
//        System.out.println(list.indexOf("Stuart"));
//        if (!list.remove("Stuart")) System.out.println("нет такого..");
//        else System.out.println(" removed successfully!");
//        System.out.println(list);
//        list.insert(2, "Stuart");
//        System.out.println(list);
//        System.out.println(list.removeFirst());
//        System.out.println(list.removeLast());
//        System.out.println(list);

//        MyLinkedQueue queue = new MyLinkedQueue();
//        queue.enqueue("First");
//        queue.enqueue("Second");
//        queue.enqueue("Third");
//        System.out.println("Очередь пуста?: " + queue.isEmpty());
//        System.out.println("размер очереди: " + queue.size());
//        System.out.println(queue.dequeue());
//        System.out.println(queue.dequeue());
//        System.out.println("размер очереди: " + queue.size());
//        System.out.println(queue.peek());

        MyOneLinkedList myOneLinkedList = new MyOneLinkedList();
        myOneLinkedList.insertFirst("1");
        myOneLinkedList.insertFirst("2");
        myOneLinkedList.insertFirst("3");
        myOneLinkedList.insertFirst(4);
        System.out.println(myOneLinkedList);
        myOneLinkedList.insert(3, "6");
        System.out.println(myOneLinkedList);
        System.out.println(myOneLinkedList.removeFirst());
        System.out.println(myOneLinkedList.remove("6"));
        System.out.println(myOneLinkedList);
        System.out.println("индекс значения 3: " + myOneLinkedList.indexOf("3"));
        System.out.println("Список пуст?: " + myOneLinkedList.isEmpty());
        System.out.println("Есть ли в списке значение 5?: " + myOneLinkedList.contains("5"));
        System.out.println("Первый в списке: " + myOneLinkedList.getFirst());
    }
}
