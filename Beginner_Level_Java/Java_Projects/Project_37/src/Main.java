import java.util.Scanner;

public class Main {
    static void designMethod(int number) {
        if (number > 0) {
            System.out.print(number + " ");
            designMethod(number - 5);
        }
        System.out.print(number + " ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        int number = input.nextInt();

        designMethod(number);
    }
}