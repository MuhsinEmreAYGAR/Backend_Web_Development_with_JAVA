import java.util.Scanner;

public class Main {

    static int power(int base, int exp) {
        int result = 1;
        for (int i = 1; i <= exp; i++) {
            result *= base;
        }
        return result;
    }
    static boolean isPalindrom(int number) {
        int temp, counter = 0, digit, reverseNumber = 0;
        temp = number;
        while (number != 0) {
            number /= 10;
            counter++;
        }
        number = temp;
        while (number != 0) {
            digit = number % 10;
            number /= 10;
            reverseNumber = reverseNumber + (digit * (power(10, counter - 1)));
            counter--;
        }

        number = temp;
        if (reverseNumber == number) return true;
        else return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = scan.nextInt();

        if (isPalindrom(number)) {
            System.out.println(number + " sayısı bir Palindrom sayıdır.");
        } else System.out.println(number + " sayısı bir Palindrom sayı değildir.");
    }
}