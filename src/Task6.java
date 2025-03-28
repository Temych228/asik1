import java.util.Scanner;

public class Task6 {
    public static int function(int n, int m){
        int relust = 1;
        for (int i = 0; i < m; i++) {
            relust*=n;
        }
        return relust;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        input.close();
        int result = function(n,m);
        System.out.println(result);
    }
}
