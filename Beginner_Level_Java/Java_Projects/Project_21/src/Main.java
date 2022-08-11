import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number, f;
        Scanner scan = new Scanner(System.in);

        System.out.print("Üssü alınacak sayı: ");
        number = scan.nextInt();

        System.out.print("Üs olacak sayı: ");
        f = scan.nextInt();

        for (int i = 1; i < f; i++) {
            number = number * number;
        }
        System.out.println("Cevap= " + number);
    }
}