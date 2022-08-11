import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int var1, var2, select;
        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci değişkeni giriniz: ");
        var1 = inp.nextInt();
        System.out.print("İkinci değişkeni giriniz: ");
        var2 = inp.nextInt();

        System.out.println("--------------------------");
        System.out.println("Toplama yapmak için = 1");
        System.out.println("Çıkarma yapmak için = 2");
        System.out.println("Çarpma  yapmak için = 3");
        System.out.println("Bölme   yapmak için = 4");
        select = inp.nextInt();

        switch (select) {

            case 1:
                System.out.print("Toplama işleminin sonucu =" + (var1 + var2));
                break;
            case 2:
                System.out.print("Çıkarma işleminin sonucu =" + (var1 - var2));
                break;
            case 3:
                System.out.print("Çarpma işleminin sonucu =" + (var1 * var2));
                break;
            case 4:
                System.out.print("Bölme işleminin sonucu =" + (var1 / var2));
                break;
            default:
                System.out.println("Girdiğiniz rakama işlem atanmamıştır.\nLütfen verilen sayılardan birini seçiniz.");
        }
    }
}
