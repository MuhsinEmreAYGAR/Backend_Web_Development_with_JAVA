import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int day, month;
        Scanner inp = new Scanner(System.in);
        System.out.println("-----------------------");
        System.out.print("Doğduğunuz ayı giriniz: ");
        month = inp.nextInt();
        System.out.println("-----------------------");
        System.out.print("Doğduğunuz günü giriniz: ");
        day = inp.nextInt();
        System.out.println("-----------------------");

        if (month == 1) {
            if ((day >= 22) && (day <= 31)) {
                System.out.println("Burcunuz Kova Burcudur.");
            } else if ((day > 0) && (day <= 21)) {
                System.out.println("Burcunuz Oğlak Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 2) {
            if ((day >= 20) && (day <= 29)) {
                System.out.println("Burcunuz Balık Burcudur.");
            } else if ((day > 0) && (day <= 19)) {
                System.out.println("Burcunuz Kova Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 3) {
            if ((day >= 21) && (day <= 31)) {
                System.out.println("Burcunuz Koç Burcudur.");
            } else if ((day > 0) && (day <= 20)) {
                System.out.println("Burcunuz Balık Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 4) {
            if ((day >= 21) && (day <= 30)) {
                System.out.println("Burcunuz Boğa Burcudur.");
            } else if ((day > 0) && (day <= 21)) {
                System.out.println("Burcunuz Koç Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 5) {
            if ((day >= 22) && (day <= 31)) {
                System.out.println("Burcunuz İkizler Burcudur.");
            } else if ((day > 0) && (day <= 22)) {
                System.out.println("Burcunuz Boğa Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 6) {
            if ((day >= 23) && (day <= 30)) {
                System.out.println("Burcunuz Yengeç Burcudur.");
            } else if ((day > 0) && (day <= 22)) {
                System.out.println("Burcunuz İkizler Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 7) {
            if ((day >= 23) && (day <= 31)) {
                System.out.println("Burcunuz Aslan Burcudur.");
            } else if ((day > 0) && (day <= 22)) {
                System.out.println("Burcunuz Yengeç Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 8) {
            if ((day >= 23) && (day <= 31)) {
                System.out.println("Burcunuz Başak Burcudur.");
            } else if ((day > 0) && (day <= 22)) {
                System.out.println("Burcunuz Aslan Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 9) {
            if ((day >= 23) && (day <= 30)) {
                System.out.println("Burcunuz Terazi Burcudur.");
            } else if ((day > 0) && (day <= 22)) {
                System.out.println("Burcunuz Başak Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 10) {
            if ((day >= 23) && (day <= 31)) {
                System.out.println("Burcunuz Akrep Burcudur.");
            } else if ((day > 0) && (day <= 21)) {
                System.out.println("Burcunuz Terazi Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 11) {
            if ((day >= 22) && (day <= 30)) {
                System.out.println("Burcunuz Yay Burcudur.");
            } else if ((day > 0) && (day <= 21)) {
                System.out.println("Burcunuz Akrep Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else if (month == 12) {
            if ((day >= 22) && (day <= 31)) {
                System.out.println("Burcunuz Oğlak Burcudur.");
            } else if ((day > 0) && (day <= 21)) {
                System.out.println("Burcunuz Yay Burcudur.");
            } else {
                System.out.println("Hatalı veri girdiniz.");
            }
        } else {
            System.out.println("Hatalı veri girdiniz!");
        }
        System.out.println("-----------------------");
    }
}