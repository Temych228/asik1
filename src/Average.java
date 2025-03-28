import java.util.Scanner;

public class Average {
    public static float average(int n, float[] m) {
        float result = 0;
        for (int i = 0; i < n; i++) {
            result+=m[i];
        }
        return result/n;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    float[] m = new float[n];
    for (int i = 0; i < n; i++) {
        m[i] = input.nextInt();
    }
    input.close();
    System.out.println(average(n, m));
    }
}
