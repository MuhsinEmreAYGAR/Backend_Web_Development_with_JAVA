import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, temporary;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        number = inp.nextInt();

        /*       while (i <= number) {

            System.out.println(i);
            i*=2;
        }*/

        System.out.println("-----------------------");
        System.out.print(number + " sayısına kadar 4'ün katı olan sayılar: {");

        for (int i = 1; i <= number; i *= 4) {
            System.out.print(i);
            if ((i * 4) > number) break;
            System.out.print(",");
        }
        System.out.println("}");

        System.out.println("-----------------------");
        System.out.print(number + " sayısına kadar 5'ün katı olan sayılar: {");

        for (int j = 1; j <= number; j *= 5) {

            temporary = j;
            j = 1;

            for (; j <= number; j++) {
                if (j == temporary) System.out.print(j);
            }
            if (((temporary * 5) > number)) {
                break;
            }
            j = temporary;
            System.out.print(",");
        }
        System.out.print("}");
    }
}