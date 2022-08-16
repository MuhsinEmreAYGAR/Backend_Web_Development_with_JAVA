import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\nMAYIN TARLASI OYUNUNA HOŞ GELDİNİZ");
        System.out.println("==============================================");
        System.out.print("Oynamak isteğiniz Tablonun satır sayısı: ");
        int row = inp.nextInt();
        System.out.print("Oynamak isteğiniz Tablonun sütUn sayısı: ");
        int column = inp.nextInt();

        System.out.println("==============================================");
        MineSweeper game = new MineSweeper(row, column);
        game.run();
    }
}