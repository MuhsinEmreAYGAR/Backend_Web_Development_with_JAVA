public class Main {
    public static void main(String[] args) {
        System.out.print("1 ile 100 arasındaki asal sayılar = {");

        for (int i = 2; i < 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (((i % j) == 0)) isPrime = false;
            }
            if (isPrime) {
                System.out.print(i);
                if (i == 97) break;
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}