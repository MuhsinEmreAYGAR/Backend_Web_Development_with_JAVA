import java.util.Scanner;
import java.util.Arrays;

public class Main {

    static double harmonicSeries(int[] arr) {
        double result = 0;
        for (double i : arr) {
            result += (1 / i);
        }
        return result;
    }

    static void fillArray(int[] arr) {
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            arr[i] = inp.nextInt();
            if (arr[i] == 0) {
                System.out.println("Geçersiz değer girdiniz!");
                System.out.println("Lütfen sıfırdan farklı bir değer giriniz.");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double result;

        /*        int[] number = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : number) {
            sum += i;
        }
        System.out.println("Ortalama = " + (sum / number.length));  */

        System.out.print("Dizi kaç elemanlı olsun: ");
        int amount = inp.nextInt();
        System.out.println("==============================");

        int[] myArray = new int[amount];
        fillArray(myArray);
        System.out.println("==============================");
        System.out.println("Girdiğiniz dizi => " + Arrays.toString(myArray));

        result = myArray.length / harmonicSeries(myArray);
        System.out.println("==============================");
        System.out.println("Girdiğiniz dizinin harmonik ortalaması : " + result);
    }
}