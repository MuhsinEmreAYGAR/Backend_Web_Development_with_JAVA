import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
/*      System.out.print("Sayı giriniz: ");
        int number0 = inp.nextInt();
        int tempNumber = number0;
        int digit;
        int digitPow = 1;
        int amountDigit = 0;
        int sumPower = 0;

        while (number0 != 0) {
            number0 = number0 / 10;
            amountDigit++;
        }

        number0 = tempNumber;

        while (number0 != 0) {

            digit = number0 % 10;

            number0 = number0 / 10;

            for (int i = 1; i <= amountDigit; i++) {
                digitPow = digitPow * digit;
            }
            sumPower += digitPow;
            digitPow = 1;
        }
        number0 = tempNumber;

        if (sumPower==number0) System.out.println("Girdiğiniz sayı Armstrong sayıdır.");
        else System.out.println("Girdiğiniz sayı Armstrong sayı değildir.");                                                                                                  */

        System.out.println("----------------------------");
        System.out.print("Bir sayı giriniz: ");
        int number = inp.nextInt();
        int temporary, sum = 0;

        while ((number != 0)) {
            temporary = number / 10;
            sum += number % 10;
            number = temporary;
        }
        System.out.println("Girdiğiniz sayının basamaklarının toplamı= " + sum);
    }
}