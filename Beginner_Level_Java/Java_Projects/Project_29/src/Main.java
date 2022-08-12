import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Üçgenin basamak sayısını giriniz: ");
        int n = scan.nextInt();
        System.out.println("-------------------");
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}