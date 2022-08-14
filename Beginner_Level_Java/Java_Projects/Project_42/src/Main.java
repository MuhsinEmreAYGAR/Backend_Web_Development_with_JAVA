import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /*  int[] array = {56, 34, 1, 8, 101, -2, -33};

        int min = array[0];
        int max = array[0];

        for (int i : array) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Dizinin en küçük elemanı : " + min);
        System.out.println("Dizinin en büyük elemanı : " + max);    */

        Scanner inp = new Scanner(System.in);
        int[] myArray = {15, 12, 788, 1, -1, -788, 2, 0};

        System.out.print("Girilen sayı : ");
        int ind = inp.nextInt();

        Arrays.sort(myArray);

        int closestBiggest = myArray[0];
        int closestSmallest = myArray[0];

        for (int i : myArray) {

            if (i > ind) {
                closestBiggest = i;
                break;
            }
            if (i < ind) {
                closestSmallest = i;
            }
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :" + closestSmallest);
        System.out.println("Girilen sayıdan büyük en yakın sayı :" + closestBiggest);
    }
}