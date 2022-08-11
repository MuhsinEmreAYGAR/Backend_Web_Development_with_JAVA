import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temperature;
        Scanner inp = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        temperature = inp.nextInt();

        if (temperature < 5) {
            System.out.print("Bu sıcaklıkta \"Kayak\" yapmanızı öneririz.");

        } else if ((temperature <= 25)) {
            if (temperature < 10) {
                System.out.print("Bu sıcaklıkta \"Sinema\"'ya gitmenizi öneririz.");
            }
            if ((temperature >= 10) && (temperature <= 15)) {
                System.out.println("Bu sıcaklıkta \"Sinema\"ya gitmenizi ya da \"Piknik\" yapmanızı öneririz.");
            } else if (temperature > 15) {
                System.out.println("Bu sıcaklıkta \"Piknik\" yapmanızı öneririz.");
            }
        } else {
            System.out.print("Bu sıcaklıkta \"Yüzme\"ye gitmenizi öneririz.");
        }
    }
}