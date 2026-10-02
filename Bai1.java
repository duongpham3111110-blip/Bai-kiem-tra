import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        Map<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            map.put(a[i], map.getOrDefault(a[i], 0) + 1);
        }

        int max = 0;
        for (int x : map.values()) {
            if (x > max) max = x;
        }

        for (int x : map.keySet()) {
            if (map.get(x) == max) {
                System.out.println("Mon " + x + " ban chay nhat (" + max + " lan)");
            }
        }
    }
}