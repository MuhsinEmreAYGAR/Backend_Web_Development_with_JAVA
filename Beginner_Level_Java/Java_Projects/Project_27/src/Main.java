import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Kaç tane sayı girecesiniz: ");
        int n = inp.nextInt();

        if (n<=0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        int temp;
        int max = 0, min = 0;

        for (int i = 1; i <= n; i++) {

            System.out.print(i + ". sayıyı giriniz: ");
            temp = inp.nextInt();

            if (i == 1) {
                max = temp;
                min = temp;
            }

            if (max < temp) {
                max = temp;
            }

            if (min > temp) {
                min = temp;
            }
        }
        System.out.println("En büyük sayı: " + max);
        System.out.println("En küçük sayı: " + min);
    }
}