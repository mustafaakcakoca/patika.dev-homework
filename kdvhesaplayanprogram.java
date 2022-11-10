import java.util.Scanner;
/*
* @author Mustafa
 */
public class kdvhesaplayanprogram {
    public static void main(String[] args) {
        Scanner fiyat = new Scanner (System.in);

       double kdvsizFiyat,kdvOrani1=0.18f,kdvOrani2=0.08f;
        System.out.println("Ürünün Kdvsiz Fiyatını Giriniz");
        kdvsizFiyat=fiyat.nextFloat();

        //KDV TUTARI HESAPLAMA
        double kdvTutari= (kdvsizFiyat >=0 && kdvsizFiyat <=1000 ) ? (kdvsizFiyat * kdvOrani1) : (kdvsizFiyat * kdvOrani2);

        //KDVLİ FİYAT HESAPLAMA

        double kdvliFiyat = (kdvsizFiyat >= 0 && kdvsizFiyat <=1000) ? (kdvsizFiyat * kdvOrani1) + kdvsizFiyat
                : (kdvsizFiyat * kdvOrani2) + kdvsizFiyat;


        //Ürünün Kdvsiz Fiyatını,Kdv Oranını, Kdv Tutarını,Kdvli Fiyatı ekrana yazdırma

        System.out.println("Ürünün KDVsiz Fiyatı" + kdvsizFiyat);
        String kdvOrani3=(kdvsizFiyat >=0 && kdvsizFiyat <=1000) ? "Kdv Oranı - 18%" : "Kdv Oranı - 8%";
        System.out.println(kdvOrani3);
        System.out.println("kdvTutari" + kdvTutari);
        System.out.println("Ürünün KDVli Fiyatı" + kdvliFiyat);







    }
}
