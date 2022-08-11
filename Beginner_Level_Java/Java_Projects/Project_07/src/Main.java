import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int amount;
        double total = 0, perPearPrice = 2.14, perApplePrice = 3.67, perTomatoPrice = 1.11, perBananaPrice = 0.95, perAuberginePrice = 5.0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Armut kaç kilo : ");
        amount = inp.nextInt();
        total += amount * perPearPrice;

        System.out.print("Elma kaç kilo : ");
        amount = inp.nextInt();
        total += amount * perApplePrice;

        System.out.print("Domates kaç kilo : ");
        amount = inp.nextInt();
        total += amount * perTomatoPrice;

        System.out.print("Muz kaç kilo : ");
        amount = inp.nextInt();
        total += amount * perBananaPrice;

        System.out.print("Patlıcan kaç kilo : ");
        amount = inp.nextInt();
        total += amount * perAuberginePrice;

        System.out.print("Toplam tutar : " + total);
    }
}