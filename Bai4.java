import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b == 0) {
            System.out.println("Mau so khong hop le");
            return;
        }

        int x = Math.abs(a);
        int y = Math.abs(b);

        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }

        a = a / x;
        b = b / x;

        if (b < 0) {
            a = -a;
            b = -b;
        }

        System.out.println(a + "/" + b);
    }
}