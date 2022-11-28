
import java.util.Scanner;

public class ucakfiyati{

    public static void main(String[] args) {
        int mesafe,yas,yTipi;
        double tutar;
        Scanner sc=new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz :");
        mesafe = sc.nextInt();
        System.out.print("Yaşınızı giriniz :");
        yas = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
        yTipi = sc.nextInt();

        tutar = mesafe*0.10;

        if ((yas < 1 || mesafe < 1) || (yTipi != 1 && yTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
        }else if (yas<12) {
            if (yTipi==2) {
                System.out.println("Toplam tutar: "+ ((tutar-(tutar*0.50))-((tutar-(tutar*0.50))*0.20)));
            }else{
                System.out.println("Toplam tutar: "+ (tutar-(tutar*0.50)));
            }

        }else if (yas<24) {
            if (yTipi==2) {
                System.out.println("Toplam tutar: "+ ((tutar-(tutar*0.10))-((tutar-(tutar*0.10))*0.20)));
            }else{
                System.out.println("Toplam tutar: "+ (tutar-(tutar*0.10)));
            }

        }else if (yas>65) {
            if (yTipi==2) {
                System.out.println("Toplam tutar: "+ ((tutar-(tutar*0.30))-((tutar-(tutar*0.30))*0.20)));
            }else{
                System.out.println("Toplam tutar: "+ (tutar-(tutar*0.30)));
            }

        }else{
            if (yTipi==2) {
                System.out.println("Toplam tutar: "+(tutar-(tutar*0.20)));

            }else{
                System.out.println("Toplam tutar: "+ tutar);
            }
        }


    }
    }

