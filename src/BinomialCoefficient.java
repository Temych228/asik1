import java.util.Scanner;

public class BinomialCoefficient {
    public static int BinomialCoefficient(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        }
        return BinomialCoefficient(n - 1, k - 1) + BinomialCoefficient(n - 1, k);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        input.close();
        System.out.println(BinomialCoefficient(n, k));
    }
}
