import java.util.Scanner;

public class Digits {
    public static String Digits(String s) {
        if (s == null || s.isEmpty()) {
            return "NO";
        }
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return "NO";
            }
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(Digits(s));
        input.close();
    }
}
