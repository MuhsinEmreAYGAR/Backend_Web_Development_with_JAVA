import java.util.Scanner;

public class Main {
    static int power(int base, int exponent) {
        if (base == 1 || exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("Taban değeri giriniz : ");
            int base = scan.nextInt();
            System.out.print("Üs değeri giriniz : ");
            int exponent = scan.nextInt();
            System.out.println("Sonuç : " + power(base, exponent));
            System.out.println("--------------------------");
        }
    }
}