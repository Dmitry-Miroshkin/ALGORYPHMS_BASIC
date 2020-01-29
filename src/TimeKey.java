import java.util.Scanner;

public class TimeKey {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String outStr = Integer.toBinaryString(a);
        System.out.println(a + Integer.parseInt(String.valueOf(outStr.codePoints().filter(ch -> ch == '1').count())));
    }
}
