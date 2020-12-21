import java.util.Random;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Nhap do dai cua mang: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(10) + 1;
            System.out.print(arr[i] + " , "+"\t");
        }
        int min = arr[0];
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }

        }
        System.out.println("Gia tri nho nhat trong mang: " + min );
    }
}
