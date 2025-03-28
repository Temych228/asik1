import java.util.Scanner;

public class Prime {
    public static String  isPrime(int n) {
        if (n < 2) {
            return "Prime";
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return "Composite";
            }
        }
        return "Prime";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(isPrime(n));
        input.close();
    }
}
