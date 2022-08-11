import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

 /*     int r;
        double alan, cevre, pi = 3.14;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = inp.nextInt();

        alan = pi * r * r;
        cevre = 2 * pi * r;

        System.out.println("Dairenin alanı: " + alan);
        System.out.print("Dairenin çevresi: " + cevre);
    */
        int r, degree;
        double area, pi = 3.14;
        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarı çapını giriniz: ");
        r = input.nextInt();

        System.out.print("Dairenin merkez açı ölçüsünü giriniz: ");
        degree = input.nextInt();

        area = (pi * (r * r) * degree) / 360;

        System.out.print("Daire diliminin alanı: " + area);
    }
}