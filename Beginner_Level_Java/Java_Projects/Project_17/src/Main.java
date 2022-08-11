import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, sum = 0, counter = 0;
        double average;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();
        System.out.println("--------------------");

 /*       for (int i = 0; i <= number; i++) {
            if ((i % 2) == 1) {
                System.out.print(",");
                continue;
            }
            System.out.print(i);
        }*/

        System.out.print("Bölenler = ");

        for (int i = 1; i <= number; i++) {

            if (((i % 3) == 0) && ((i % 4) == 0)) {
                System.out.print(i + " ");

                sum += i;
                counter++;
            }
        }
        average = sum / counter;
        System.out.println("\n--------------------");
        System.out.println("Ortalama = " + average);
    }
}