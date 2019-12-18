import java.util.Scanner;

public class ones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String outStr = Integer.toBinaryString(a);
        System.out.println(outStr.codePoints().filter(ch -> ch == '1').count());
    }
}