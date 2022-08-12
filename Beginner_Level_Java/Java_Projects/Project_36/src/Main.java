import java.util.Scanner;

public class Main {
    static int i = 2;

    public static boolean isPrime(int number) {
        if ((number % i) == 0) {
            return false;
        }
        if (i == number - 1) return true;

        i++;
        return isPrime(number);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int number = inp.nextInt();

        if (isPrime(number) || (number == 2)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL DEĞİLDİR ! ");
        }
    }
}