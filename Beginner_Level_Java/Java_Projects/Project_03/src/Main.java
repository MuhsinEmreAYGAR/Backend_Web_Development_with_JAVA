import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        int a, b;
//        double c;
//        Scanner inp = new Scanner(System.in);
//
//        System.out.print("Birinci kenarı giriniz: ");
//        a = inp.nextInt();
//
//        System.out.print("İkinci kenarı giriniz: ");
//        b = inp.nextInt();
//
//        c = Math.sqrt((b * b) + (a * a));
//        System.out.println("Hipotenüs uzunluğu: " + c);

        int a, b, c;
        double u, alan;

        Scanner input = new Scanner(System.in);

        System.out.print("1. Kenarı giriniz: ");
        a = input.nextInt();

        System.out.print("2. Kenarı giriniz: ");
        b = input.nextInt();

        System.out.print("3. Kenarı giriniz: ");
        c = input.nextInt();

        u = (a + b + c) / 2.0;

        alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));

        System.out.print("Üçgenin alanı: " + alan);
    }
}
