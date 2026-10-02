import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] words = s.split(" ");
        String max = "";

        for (String word : words) {
            if (word.length() > max.length()) {
                max = word;
            }
        }

        System.out.println(max.length() + " tu, tu dai nhat: \"" + max + "\"");
    }
}