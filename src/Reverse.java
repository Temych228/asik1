import java.util.Scanner;

public class Reverse {
    public static void reverse(int n, Scanner input) {
        int num = input.nextInt();
        reverse(n - 1, input);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        reverse(n, input);
        input.close();
    }
}
