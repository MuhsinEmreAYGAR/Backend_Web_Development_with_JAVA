import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);
    static double num1, num2;
    static int[] numbers;

    static void plus() {
        int sum = 0;
        System.out.print("\nToplayacağınız sayı adedi: ");
        numbers = new int[inp.nextInt()];

        takeNumber(numbers);

        for (int i : numbers) {
            sum += i;
        }
        System.out.println("\nGirdiğiniz sayıların toplamı = " + sum);
    }

    static void minus() {
        System.out.print("\n1. sayıyı giriniz: ");
        num1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        num2 = inp.nextInt();
        System.out.println("\nÇıkarma işleminizin sonucu = " + (num1 - num2));
    }

    static void times() {
        int multiplicate = 1;
        System.out.print("\nÇarpmak istediğiniz sayı adedi: ");
        numbers = new int[inp.nextInt()];

        takeNumber(numbers);

        for (int i : numbers) {
            multiplicate *= i;
        }
        System.out.println("\nGirdiğiniz sayıların çarpımı = " + multiplicate);
    }

    static void divided() {
        System.out.print("\n1. sayıyı giriniz: ");
        num1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        num2 = inp.nextInt();
        double result = (num1 / num2);
        System.out.println("\nBölme işleminizin sonucu = " + result);
    }

    static void power() {
        System.out.print("\nTaban olacak sayı:");
        num1 = inp.nextInt();
        System.out.print("üs olacak sayı:");
        num2 = inp.nextInt();
        int result = 1;
        for (int i = 0; i < num2; i++) {
            result *= num1;
        }
        System.out.println("İşleminizin cevabı = " + result);
    }

    static void factorial() {
        System.out.print("\nFaktöriyelini hesaplamak istediğiniz sayıyı giriniz: ");
        num1 = inp.nextInt();

        if (num1 < 0) System.out.println("Doğal sayı girerek işlemi tekrarlayınız.");
        else {
            int result = 1;
            for (int i = 0; i < num1; i++) {
                result *= (num1 - i);
            }
            System.out.println("İşleminizin cevabı = " + result);
        }
    }

    static void mode() {
        System.out.print("\n1. sayıyı giriniz: ");
        num1 = inp.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        num2 = inp.nextInt();
        System.out.println("\nMod işleminizin sonucu = " + (num1 % num2));
    }

    static void rectangle() {
        System.out.print("\nDikdörtgenin uzun kenarını giriniz: ");
        num1 = inp.nextInt();
        System.out.print("Dikdörtgenin kısa kenarını giriniz: ");
        num2 = inp.nextInt();

        System.out.println("Çevresini hesaplamak için -> 1");
        System.out.println("Alanını hesaplamak için   -> 2");
        System.out.print("Seçiminiz: ");
        int select = inp.nextInt();

        switch (select) {
            case 1 -> System.out.println("Dikdörtgenin çevresi = " + (2 * (num1 + num2)));
            case 2 -> System.out.println("Dikdörtgenin alanı = " + (num1 * num2));
            default -> System.out.println("Yapmak isteğiniz seçime atanmış doğru numarayı giriniz.");
        }
    }

    static void takeNumber(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            numbers[i] = inp.nextInt();
        }
    }

    public static void main(String[] args) {
        int select;
        String menu = """
                \n1-Toplama İşlemi
                2-Çıkarma İşlemi
                3-Çarpma İşlemi
                4-Bölme işlemi
                5-Üslü Sayı Hesaplama
                6-Faktöriyel Hesaplama
                7-Mod Alma
                8-Dikdörtgen Alan ve Çevre Hesabı
                0-Çıkış yap""";
        do {
            System.out.println(menu);
            System.out.print("Yapmak istediğiniz işleme atanan rakamı giriniz: ");
            select = inp.nextInt();

            switch (select) {
                case 1 -> plus();
                case 2 -> minus();
                case 3 -> times();
                case 4 -> divided();
                case 5 -> power();
                case 6 -> factorial();
                case 7 -> mode();
                case 8 -> rectangle();
                default -> System.out.println("Yanlış değer girdiniz, tekrar deneyiniz.");
            }
        } while (select != 0);
    }
}