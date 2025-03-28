import java.util.Scanner;

public class In___This___Task___Function___Find___Minimum___Value___From___Five___Integers___And___Then___Output___It___In___Console___And___You___Grade___This___Task___For___100___From___100 {
    public static int findMin(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array is empty or null");
        }

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 5;
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println(findMin(numbers));
        input.close();
    }
}