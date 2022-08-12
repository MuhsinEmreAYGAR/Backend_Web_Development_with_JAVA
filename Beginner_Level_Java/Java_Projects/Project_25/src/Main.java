import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String name = "Muhsin Emre";
        String password = "java123";
        String userName, userPass;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select, amount;

        while (right > 0) {

            System.out.print("Kullanıcı adınız: ");
            userName = inp.nextLine();
            System.out.print("Şifreniz: ");
            userPass = inp.nextLine();

            if (userName.equals(name) && userPass.equals(password)) {
                System.out.println("\nDev banka hoşgeldiniz.");

                do {
                    System.out.print("""
                            \n1- Para Yatırma
                            2- Para Çekme
                            3- Bakiye Sorgula
                            4- Çıkış Yap
                            Lütfen yapmak istediğiniz işlemi seçiniz :""");
                    select = inp.nextInt();

                    switch (select) {
                        case 1 -> {
                            System.out.print("Yatırılacak para miktarı: ");
                            amount = inp.nextInt();
                            balance += amount;
                        }
                        case 2 -> {
                            System.out.print("Çekmek istediğiniz para miktarı: ");
                            amount = inp.nextInt();
                            if (amount < balance) balance -= amount;
                            else System.out.println("Yetersiz bakiye");

                        }
                        case 3 -> {
                            System.out.println("Mevcut bakiyeniz: " + balance);
                        }
                        case 4 -> {
                            System.out.println("\n~~ Bizi seçtiniz için teşekkür ederiz. Yeniden görüşmek üzere ~~");
                        }
                        default -> System.out.println("Hatalı işlem seçtiniz tekrar deneyiniz.\n");
                    }
                } while (select != 4);
                break;
            } else {
                right--;
                System.out.println("Şifrenizi ya da kullanıcı adınızı yanlış girdiniz.");
                if (right == 0) {
                    System.out.println("Kartınınz bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right + "\n");
                }
            }
        }
    }
}