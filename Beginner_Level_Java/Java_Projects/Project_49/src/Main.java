import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String str) {

        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        boolean isTrue = true;

        while (isTrue) {
            System.out.print("\nBir kelime giriniz: ");
            String str = inp.next();

            if (str.equals(" ")) {
                isTrue = false;
            } else {
                if (isPalindrome(str)) System.out.println("\n" + str + " kelimesi palindrom bir kelimedir.");
                else System.out.println("\n" + str + " kelimesi palindrom bir kelime değildir.");
            }
        }
    }
}