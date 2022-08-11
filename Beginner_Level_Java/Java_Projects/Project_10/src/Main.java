import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int math, physics, literature, chemistry, music, rightNote = 0;
        double average = 0.0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        math = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        physics = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        literature = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        chemistry = inp.nextInt();

        System.out.print("Müzik notunuz: ");
        music = inp.nextInt();

        if ((math <= 100) && (math >= 0)) {
            average += math;
            rightNote++;
        }

        if ((physics <= 100) && (physics >= 0)) {
            average += physics;
            rightNote++;
        }

        if ((literature <= 100) && (literature >= 0)) {
            average += literature;
            rightNote++;
        }

        if ((chemistry <= 100) && (chemistry >= 0)) {
            average += chemistry;
            rightNote++;
        }

        if ((music <= 100) && (music >= 0)) {
            average += music;
            rightNote++;
        }

        System.out.println("------------------------------");

        if (average >= 55) {
            System.out.print("Sınıfı geçtiniz!!! \nOrtalamanız: " + (average / rightNote));
        } else {
            System.out.print("Sınıfta kaldınız!!!\nOrtalamanız: " + (average / rightNote));
        }
    }
}