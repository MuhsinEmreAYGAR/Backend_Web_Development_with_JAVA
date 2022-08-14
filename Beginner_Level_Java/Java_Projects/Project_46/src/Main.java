import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner inp = new Scanner(System.in);

    static void fillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print((i + 1) + ". değeri giriniz: ");
            arr[i] = inp.nextInt();
        }
    }

    static boolean hasValue(int[][] arr, int value) {
        for (int[] number : arr) {
            for (int a : number) {
                if (a == value) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.print("Gireceğiniz dizinin indeks sayısı: ");
        int[] myArr = new int[inp.nextInt()];
        fillArray(myArr);
        System.out.println("\nDizi : " + Arrays.toString(myArr));
        System.out.println("Tekrar Sayıları");


        int[][] matrix = new int[myArr.length][2];
        int startIndex = 0;

        for (int i = 0; i < myArr.length; i++) {
            int counter = 0;

            if (startIndex == matrix.length) {
                break;
            } else if (!(hasValue(matrix, myArr[i]))) {
                matrix[startIndex][0] = myArr[i];

                for (int j = 0; j < myArr.length; j++) {
                    if (myArr[j] == matrix[startIndex][0]) {
                        counter++;
                    }
                }
                matrix[startIndex][1] = counter;
                startIndex++;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i][0] != 0) {
                System.out.println(matrix[i][0] + " sayısı " + matrix[i][1] + " kere tekrar edildi.");
            }
        }
    }
}