import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);
        System.out.print("Fibonacci serisinin eleman sayısını girin: ");
        int n = inp.nextInt();
        int var1 = 0;
        int var2 = 1;
        int sum = 0;

        System.out.println(var1);
        for (int i = 1; i < n; i++) {
            System.out.println(var2);
            sum = var1 + var2;
            var1 = var2;
            var2 = sum;
        }
    }
}