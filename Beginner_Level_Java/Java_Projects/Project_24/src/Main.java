import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = klavye.nextInt();
        int counter = 0;

/*       for (int i = 0; i < n; i++) {
            for (int j = 0; j < (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i + 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        } */

        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            counter = 0;
            for (int k = 1; k <= 2 * i + 1; k++) {
                System.out.print("*");
                counter++;
            }
            System.out.println();
        }

        int y = -2;
        for (int a = 1; a < n; a++) {
            for (int b = 0; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < (counter + y); c++) {
                System.out.print("*");
            }
            y = y - 2;
            System.out.println();
        }
    }
}