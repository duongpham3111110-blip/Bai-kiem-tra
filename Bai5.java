import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int x = sc.nextInt();
        int left = 0, right = n - 1;
        int pos = -1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (a[mid] == x) {
                pos = mid + 1;
                break;
            } else if (a[mid] < x) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (pos == -1) {
            System.out.println("Khong tim thay");
        } else {
            System.out.println("Vi tri " + pos);
        }
    }
}