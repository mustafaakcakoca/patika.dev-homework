import java.util.Scanner;
public class Kullanicigirisi {
    public static void main(String[] args) {
        String userName, password, changePassword, newPassword;
        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = inp.nextLine();
        System.out.print("Şifreniz : ");
        password = inp.nextLine();
        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else {
            System.out.println("Bilgileriniz Yanlış!");
            System.out.println("Şifrenizi Değiştirmek İster Misiniz ? Evet Hayır Şeklinde Cevap Veriniz : ");
            changePassword = inp.nextLine();
            if (changePassword.equals("Evet")) {
                System.out.println("Yeni Şifrenizi Giriniz");
                newPassword = inp.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Yeni Şifre Eskisi ile Aynı Olamaz!");
                }else{
                    System.out.println("Şifre Oluşturuldu");
                }
            }
        }
    }
}