import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int var1, var2, EKOK = 1, EBOB = 1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Birinci sayıyı giriniz: ");
        var1 = scan.nextInt();

        System.out.print("İkinci sayıyı giriniz: ");
        var2 = scan.nextInt();

        int i = 1;
        boolean istrue = false;

        while (true) {
            int j = 1;
            while (j < 100) {
                if ((var1 * i) == (var2 * j)) {
                    EKOK = var1 * i;
                    istrue = true;
                    break;
                }
                if (var2 * j > var1 * i) break;
                j++;
            }
            if (istrue) break;
            i++;
        }

        int k = var1;

        while (k > 0) {
            if (((var1 % k) == 0) && ((var2 % k) == 0)) {
                EBOB = k;
                break;
            }
            k--;
        }
        System.out.println("EKOK = " + EKOK);
        System.out.println("EBOB = " + EBOB);
    }
}