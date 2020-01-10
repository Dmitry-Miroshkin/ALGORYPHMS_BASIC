import java.util.Scanner;

public class Class5x5 {
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        long b = a/10;
        if (b == 0) s = "25";
        else s = String.valueOf(100 * b * (b + 1) + 25);
        System.out.println(s);
    }
}
