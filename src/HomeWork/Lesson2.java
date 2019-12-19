package HomeWork;

import java.util.Random;


public class Lesson2 {
    public static void main(String[] args) {
        Random rand = new Random();
        MyArr arr = new MyArr(1000); // создаем обьект типа MyArr с массивом
        for (int i = 0; i < 1000; i++) {// заполняем массив произвольными числами
            arr.arr[i] = (rand.nextInt(1000));
            arr.size++;
        }
        arr.display(); //вывод полученного массива
        int search = 45; // поиск в массиве

        System.out.println(arr.find(search));
//        arr.sortBubble();
        arr.sortSelect();
        arr.display();
        System.out.println(arr.binaryFind(566));
    }

    static class MyArr {
        int[] arr;
        int size;

        public MyArr(int capacity) {
            this.size = 0;
            arr = new int[capacity];
        }

        public boolean binaryFind(int value) { // двоичный поиск
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

        public void display() { // вывод массива в консоль
            for (int i = 0; i < this.size; i++) {
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

        public void sortBubble() { // Пузырьковая сортировка
            int out, in;
            for (out = this.size - 1; out >= 1; out--) {
                for (in = 0; in < out; in++) {
                    if (this.arr[in] > this.arr[in + 1]) {
                        change(in, in + 1);
                    }
                }
            }
        }

        private void change(int a, int b) {
            int tmp = this.arr[a];
            this.arr[a] = this.arr[b];
            this.arr[b] = tmp;
        }

        public void sortSelect() { //Сортировка методом выбора
            int out, in, mark;
            for (out = 0; out < this.size; out++) {
                mark = out;
                for (in = out + 1; in < this.size; in++) {
                    if (this.arr[in] < this.arr[mark]) {
                        mark = in;
                    }
                }
                change(out, mark);
            }
        }

        public void sortInsert(){ //Сортировка методом вставки
            int in, out;
            for(out = 1;out < this.size; out++){
                int temp = this.arr[out];
                in = out;
                while(in > 0 && this.arr[in-1] >=temp){
                    this.arr[in] = this.arr[in-1];
                    --in;
                }
                this.arr[in] = temp;
            }
        }

    }
}

