
import java.util.Scanner;

public class store_and_printArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }
}
