import java.util.Scanner;

public class Reverse {

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter elements of array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        reverseArray(arr);

        System.out.println("Reversed array:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }
}

