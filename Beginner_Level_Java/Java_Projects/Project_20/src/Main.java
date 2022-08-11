import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int N, r, nFactorial = 1, rFactorial = 1, gap, gapFactorial = 1;
        double combination;
        Scanner input = new Scanner(System.in);
        boolean isError;

/*      int number, total = 1;
        System.out.print("Bir sayı giriniz: ");
        number = input.nextInt();
       for (int i = 1; i <= number; i++) {
            total *= i;
        }
        System.out.println("Girdiğiniz sayının faktöriyeli: " + total);     */
        do {
            isError = false;

            System.out.println("----------------------------");
            System.out.print("Kümenin eleman sayısını giriniz: ");
            N = input.nextInt();
            System.out.print("Oluşturmak istediğiniz grupların eleman sayısını giriniz: ");
            r = input.nextInt();

            gap = N - r;
            if (gap <= 0) {
                System.out.println("Hatalı veri girdiniz!");
                isError = true;
            }
        } while (isError);

            for (int i = 1; i <= N; i++) {
                nFactorial *= i;
            }
            for (int i = 1; i <= r; i++) {
                rFactorial *= i;
            }
            for (int i = 1; i <= gap; i++) {
                gapFactorial *= i;
            }
            System.out.println("----------------------------");

            combination = nFactorial / (rFactorial * (gapFactorial));

            System.out.println("Oluşan kombinasyon sayısı : " + combination);
        }
    }