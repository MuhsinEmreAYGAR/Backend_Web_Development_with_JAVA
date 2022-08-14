import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static Scanner inp = new Scanner(System.in);

    public static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". değeri giriniz: ");
            arr[i] = inp.nextInt();
        }
        System.out.println("\nGirdiğiniz array: " + Arrays.toString(arr));
    }

    public static boolean hasValue(int[] arr, int value) {
        for (int index : arr) {
            if (index == value) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.print("Arrayin indeks sayısı :");
        int[] list = new int[inp.nextInt()];
        fillArray(list);

        int[] duplicate = new int[list.length];
        int StartIndex = 0;

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && list[i] == list[j]) {
                    if (list[i] % 2 == 0) {
                        if (!hasValue(duplicate, list[i])) {
                            duplicate[StartIndex++] = list[i];
                            break;
                        }
                    }
                }
            }
        }
        System.out.print("\nGirilen arrayde tekrar eden değerler: { ");
        for (int value : duplicate) {
            if (value != 0) {
                System.out.print(value + ", ");
            }
        }
        System.out.println("}");
    }
}