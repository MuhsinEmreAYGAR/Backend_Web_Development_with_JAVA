import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year, zodiacSign;
        String personalZodiacSign = "";
        Scanner inp = new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        year = inp.nextInt();

        if (year <= 0) System.out.println("Hatalı Veri Girdiniz !");

        zodiacSign = year % 12;

        switch (zodiacSign) {
            case 0 -> personalZodiacSign = "Maymun";
            case 1 -> personalZodiacSign = "Horoz";
            case 2 -> personalZodiacSign = "Köpek";
            case 3 -> personalZodiacSign = "Domuz";
            case 4 -> personalZodiacSign = "Fare";
            case 5 -> personalZodiacSign = "Öküz";
            case 6 -> personalZodiacSign = "Kaplan";
            case 7 -> personalZodiacSign = "Tavşan";
            case 8 -> personalZodiacSign = "Ejderha";
            case 9 -> personalZodiacSign = "Yılan";
            case 10 -> personalZodiacSign = "At";
            case 11 -> personalZodiacSign = "Koyun";
        }
        System.out.println("Çin zodyağı burcunuz: " + personalZodiacSign);
    }
}