package HomeWork;

import java.util.Random;


public class Lesson2 {
    public static void main(String[] args) {
        Random rand = new Random();
        MyArr arr = new MyArr(1000000); // создаем обьект типа MyArr с массивом
        for (int i = 0; i < 1000000; i++) {// заполняем массив произвольными числами
            arr.arr[i] = (rand.nextInt(1000000));
            arr.size++;
        }
//        arr.display(); //вывод полученного массива
        int search = 45; // поиск в массиве

        int[] cloneArr = new int[arr.size];
        System.arraycopy(arr.arr, 0, cloneArr, 0, arr.size);
        System.out.println("Запуск пузырьковой сортировки!");
        long startTime = System.currentTimeMillis();
        arr.sortBubble(cloneArr);
        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Пузырьковый сорт занял " + timeSpent + " миллисекунд");

        int[] cloneArr2 = new int[arr.size];
        System.arraycopy(arr.arr, 0, cloneArr2, 0, arr.size);
        System.out.println("Запуск сортировки методом выбора!");
        startTime = System.currentTimeMillis();
        arr.sortSelect(cloneArr2);
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Сортировка методом выбора заняла " + timeSpent + " миллисекунд");

        int[] cloneArr3 = new int[arr.size];
        System.arraycopy(arr.arr, 0, cloneArr3, 0, arr.size);
        System.out.println("Запуск сортировки методом вставки!");
        startTime = System.currentTimeMillis();
        arr.sortInsert(cloneArr3);
        timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("Сортировка методом вставки заняла " + timeSpent + " миллисекунд");
//        arr.display(cloneArr3);
        System.out.println("Есть ли в массиве число 566? " + arr.binaryFind(cloneArr3, 566));
    }

    static class MyArr {
        int[] arr;
        int size;

        MyArr(int capacity) {
            this.size = 0;
            arr = new int[capacity];
        }

        boolean binaryFind(int[] arr, int value) { // двоичный поиск
            int low = 0;
            int high = this.size - 1;
            int mid;
            while (low <= high) {
                mid = (low + high) / 2;
                if (value == arr[mid]) {
                    return true;
                } else {
                    if (value < arr[mid]) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            return false;
        }

        public boolean find(int value) { // линейный поиск
            int i;
            for (i = 0; i < this.size; i++) {
                if (arr[i] == value) {
                    return true;
                }
            }
            return false;
        }

        public void display(int[] arr) { // вывод массива в консоль
            for (int i = 0; i < size; i++) {
                System.out.println(arr[i]);
            }
        }

        public void delete(int value) {//удаление элемента по значению
            int i;
            for (i = 0; i < this.size; i++) {
                if (arr[i] == value) {
                    break;
                }
            }

            if (this.size - 1 - i >= 0) System.arraycopy(arr, i + 1, arr, i, this.size - 1 - i);
            this.size--;
        }

        public void insertSorted(int value) { //добавление в сортированный массив
            int i;
            for (i = 0; i < this.size; i++) {
                if (arr[i] > value) {
                    break;
                }
            }
            if (this.size - i >= 0) System.arraycopy(arr, i, arr, i + 1, this.size - i);
            arr[i] = value;
            this.size++;
        }

        void sortBubble(int[] ar) { // Пузырьковая сортировка
            int out, in;
            for (out = size - 1; out >= 1; out--) {
                for (in = 0; in < out; in++) {
                    if (ar[in] > ar[in + 1]) {
                        change(in, in + 1, ar);
                    }
                }
            }
        }

        private void change(int a, int b, int[] ar2) {
            int tmp = ar2[a];
            ar2[a] = ar2[b];
            ar2[b] = tmp;
        }

        void sortSelect(int[] ar3) { //Сортировка методом выбора
            int out, in, mark;
            for (out = 0; out < this.size; out++) {
                mark = out;
                for (in = out + 1; in < this.size; in++) {
                    if (ar3[in] < ar3[mark]) {
                        mark = in;
                    }
                }
                change(out, mark, ar3);
            }
        }

        void sortInsert(int[] arr) { //Сортировка методом вставки
            int in, out;
            for (out = 1; out < this.size; out++) {
                int temp = arr[out];
                in = out;
                while (in > 0 && arr[in - 1] >= temp) {
                    arr[in] = arr[in - 1];
                    --in;
                }
                arr[in] = temp;
            }
        }
//        Пузырьковый сорт занял 1974518 миллисекунд
//        Сортировка методом выбора заняла 798743 миллисекунд
//        Сортировка методом вставки заняла 140264 миллисекунд

    }
}

