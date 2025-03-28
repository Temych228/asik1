import java.util.Scanner;

public class factorial {
    public static int facrotial(int n){
        if(n==1){ return 1; }
        return facrotial(n-1) * n;
    }
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int result = facrotial(n);
    System.out.println(result);
    }
}
