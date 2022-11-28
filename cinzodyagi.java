import java.util.Scanner;

public class cinzodyagi {
    public static void main(String[] args) {
        int cinzodyagi;
        int dtarihi;
        Scanner sc = new Scanner(System.in);

        System.out.print("Doğum Yılınızı Giriniz : ");
        dtarihi = sc.nextInt();
        cinzodyagi = dtarihi % 12;
        if (cinzodyagi==0) {
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (cinzodyagi==1) {
            System.out.println("Çin Zodyağı Burcunuz : Horoz");
        } else if (cinzodyagi==2) {
            System.out.println("Çin Zodyağı Burcunuz : Köpek");
        } else if (cinzodyagi==3) {
            System.out.println("Çin Zodyağı Burcunuz : Domuz");
        } else if (cinzodyagi==4) {
            System.out.println("Çin Zodyağı Burcunuz : Fare");
        } else if (cinzodyagi==5) {
            System.out.println("Çin Zodyağı Burcunuz : Öküz");
        } else if (cinzodyagi==6) {
            System.out.println("Çin Zodyağı Burcunuz : Kaplan");
        } else if (cinzodyagi==7) {
            System.out.println("Çin Zodyağı Burcunuz : Tavşan");
        } else if (cinzodyagi==8) {
            System.out.println("Çin Zodyağı Burcunuz : Ejderha");
        } else if (cinzodyagi==9) {
            System.out.println("Çin Zodyağı Burcunuz : Yılan ");
        } else if (cinzodyagi==10) {
            System.out.println("Çin Zodyağı Burcunuz : At");
        } else if (cinzodyagi==11) {
            System.out.println("Çin Zodyağı Burcunuz : Koyun");
        }
    }
}

