import java.util.Scanner;

public class Main {
    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Dizinin kaçıncı elemanını istiyorsunuz: ");
        int n = scan.nextInt();

        System.out.println("Dizinin " + n + ". elamanı= " + fibonacci(n));
    }
}