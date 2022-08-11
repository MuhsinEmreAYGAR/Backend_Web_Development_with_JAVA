import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int weight;
        double index, height;
        Scanner inp = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz: ");
        height = inp.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        weight = inp.nextInt();

        index = weight / (height * height);

        System.out.print("Vücut Kitle İndeksiniz: " + index);
    }
}
