import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String name = "patika";
        String password = "java123";
        String userName, userPass, newPass;
        Scanner inp = new Scanner(System.in);

        do {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = inp.nextLine();

            System.out.print("Şifrenizi giriniz: ");
            userPass = inp.nextLine();

            if (userName.equals(name) && (userPass.equals(password))) {
                System.out.println("Kullanıcı adınız ve şifreniz kabul edilmiştir.");
                break;
            } else {
                System.out.println("Geçersiz şifre veya kullanıcı adı girdiniz !");
                System.out.print("\nŞifrenizi sıfırlamak ister misiniz (E/H) = ");

                String answer = inp.nextLine();

                if (answer.equals("E")) {
                    while (true) {
                        System.out.print("Yeni şifrenizi giriniz: ");
                        newPass = inp.nextLine();

                        if (newPass.equals(password) || newPass.equals(userPass)) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                            System.out.println("=======================================");

                        } else {
                            System.out.println("Şifre oluşturuldu");
                            password = newPass;
                            break;
                        }
                    }

                } else if (answer.equals("H")) {
                    System.out.println("Şifrenizi sıfırlamamayı seçtiniz.");
                    break;
                } else {
                    System.out.println("Geçersiz değer girdiniz. Program sonlandırıldı.");
                    break;
                }
            }
        } while (true);
    }
}