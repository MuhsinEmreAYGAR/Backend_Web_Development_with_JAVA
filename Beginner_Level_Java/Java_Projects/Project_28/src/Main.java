import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        int result = 0;

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if (number == result) {
            System.out.println(number + " Mükemmel sayıdır.");
        } else {
            System.out.println(number + " Mükemmel sayı değildir.");
        }
    }
}