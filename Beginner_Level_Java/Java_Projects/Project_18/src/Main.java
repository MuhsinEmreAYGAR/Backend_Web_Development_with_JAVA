import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        int number, sum = 0;
        System.out.println("---------------");
        Scanner inp = new Scanner(System.in);

        for (int i = 0; true; i++) {
            System.out.print("Bir sayı giriniz: ");
            number = inp.nextInt();
            if ((number % 2) == 1) {
                sum += number;
            }
            if (number < 0) break;
        }
        System.out.println("---------------");
        System.out.print("Girilen tek sayıların toplamı = " + sum);
        */

        System.out.println("-----------------");
        int number, sum = 0;
        Scanner inp = new Scanner(System.in);

        for (int i = 0; true; i++) {
            System.out.print("Bir sayı giriniz: ");
            number = inp.nextInt();

            if ((number % 2) == 1) break;
            else if ((number % 4) == 0) sum += number;
        }
        System.out.println("-----------------");
        System.out.println("Girilen değerlerden çift ve 4'ün katları olan sayıların toplamı = " + sum);
    }
}