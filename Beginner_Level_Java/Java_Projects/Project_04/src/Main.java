import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km, startPrice = 10;
        double totalPrice, perKm = 2.20;

        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen mesafeyi kilometre cinsinden belirtiniz: ");
        km = input.nextInt();

        totalPrice = (km * 2.20) + 10;

        totalPrice = ((totalPrice > 0) && (totalPrice < 20)) ? 20 : totalPrice;

        System.out.println("Toplam tutar : " + totalPrice);

    }
}
