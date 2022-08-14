import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static void arraySort(int[] arr) {
        int temp;

        for (int i = 0; i < arr.length; i++) {
            int min = arr[i];

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > min) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sıralama : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz n : ");
        int bound = scan.nextInt();

        int[] array1 = new int[bound];

        System.out.println("Dizinin elemanlarını giriniz : ");

        for (int i = 0; i < array1.length; i++) {
            System.out.print((i + 1) + ". Elemanı  : ");
            array1[i] = scan.nextInt();
        }
        arraySort(array1);
    }
}