package HomeWork.Lesson5;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число: ");
        int a = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Введите степень: ");
        int b = sc1.nextInt();
        System.out.println(a + " в степени " + b + " равно " + f(a, b));
    }

    public static double f(double base, int ex) {
        if (ex > 0) {
            if (ex % 2 == 1) { // Нечетное ?
                return base * f(base, ex - 1);
            } else {
                double res = f(base, ex / 2);
                return res * res;
            }
        } else
            return 1;
    }
}
