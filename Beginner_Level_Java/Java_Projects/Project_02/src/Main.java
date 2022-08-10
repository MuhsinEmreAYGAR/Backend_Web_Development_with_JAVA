import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double tutar, kdvliTutar, kdvTutari, kdvOran;
        boolean kdvDurum;

        Scanner input = new Scanner(System.in);

        System.out.print("Tutar giriniz: ");
        tutar = input.nextInt();

        kdvDurum = (tutar > 0) && (tutar < 1000);
        kdvOran = (kdvDurum) ? 0.18 : 0.08;
        kdvTutari = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutari;

        System.out.println("Girilen tutar = " + tutar);
        System.out.println("KDV Oranı = " + kdvOran);
        System.out.println("KDV tutarı = " + kdvTutari);
        System.out.println("KDV'li Fiyat = " + kdvliTutar);
    }
}