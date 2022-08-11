import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int distance, age, travelType;
        double total, perKm = 0.10;

        Scanner inp = new Scanner(System.in);

        System.out.println("--------------------------");
        System.out.print("Mesafeyi km türünden giriniz: ");
        distance = inp.nextInt();

        if (distance <= 0) {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        total = perKm * distance;

        System.out.println("--------------------------");
        System.out.print("Yaşınızı giriniz: ");
        age = inp.nextInt();

        if ((age > 0) && (age < 12)) {
            System.out.println("Bilet tutarınıza %50 indirim uygulanacaktır.");
            total *= 0.5;
        } else if ((age >= 12) && (age <= 24)) {
            System.out.println("Bilet tutarınıza %10 indirim uygulanacaktır.");
            total *= 0.9;
        } else if ((age > 24) && (age <= 64)) {
            System.out.println("Bilet tutarınıza indirim yapılmayacaktır.");
        } else if (age > 65) {
            System.out.println("Bilet tutarınıza %30 indirim uygulanacaktır.");
            total *= 0.7;
        } else {
            System.out.println("Hatalı Veri Girdiniz !");
            return;
        }

        System.out.println("--------------------------");
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");

        travelType = inp.nextInt();

        switch (travelType) {
            case 1 -> System.out.println("Bilet tutarınıza indirim yapılmayacaktır.");

            case 2 -> {
                System.out.println("Bilet tutarınıza %20 indirim uygulanacaktır.");
                total *= 0.8;
            }
            default -> {
                System.out.print("Hatalı Veri Girdiniz !");
                return;
            }
        }
        System.out.println("--------------------------");
        System.out.println("Son durumdaki bilet fiyatınız: " + (total * travelType) + " Tl");
        System.out.println("--------------------------");
    }
}