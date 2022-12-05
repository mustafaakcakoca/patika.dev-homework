import java.util.Scanner;
public class atmproje {
    public static void main(String[] args) {
        String userName, password;
        int right = 3;
        int balance = 1500;
        int select;
        Scanner scan = new Scanner(System.in);
        if (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = scan.nextLine();
            System.out.print("Şifreniz : ");
            password = scan.nextLine();
            if (userName.equals("mustafa") && password.equals("patika123")) {
                System.out.println("Bankamıza Hoşgeldiniz ! ");
                do {
                    System.out.print("Lütfen Seçiminizi Yapınız :  \n 1-Para Yatırma : \n 2-Para Çekme : \n 3-Bakiye Sorgula : \n 4-Çıkış Yap : ");
                    select = scan.nextInt();

                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak İstediğiniz Tutar : ");
                            int price = scan.nextInt();
                            balance += price;
                            break;

                        case 2:
                            System.out.print("Çekmek İstediğiniz Tutar : ");
                            int money = scan.nextInt();
                            if (money > balance) {
                                System.out.print("Yetersiz Bakiye!");
                            } else
                                balance -= money;
                            break;

                        case 3:
                            System.out.print("Bakiyeniz : " + balance);
                            break;
                    }
                }
                while (select != 4);
                    System.out.print("Yeniden Görüşmek Üzere!");

                }
            }else{
                    right--;
                    System.out.print("Hatalı Kullanıcı Adı veya Şifre Lütfen Yeniden Deneyiniz!");
                    if (right == 0) {
                        System.out.print("Hesabınız Bloke Olmuştur Lütfen Bankanızla İletişime Geçin!");
                    } else {
                        System.out.print("Kalan Hakkınız" + right);
                    }
                }
            }
        }







