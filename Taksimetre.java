import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        /*
   Taksimetre KM başına 2.20 TL tutmaktadır.
   Minimum ödenecek tutar 20 TL'dir.
  20 TL altında ki ücretlerde yine 20 TL alınacaktır.
 Taksimetre açılış ücreti 10 TL'dir.

         */
        int km;
        double perKm=2.20,total,startPrice=10;
        Scanner _input= new Scanner(System.in);
        System.out.println("Mesafeyi KM cinsinden giriniz");
        km= _input.nextInt();
        total= km*perKm;
        total+=startPrice;
        total=(total < 20 ) ? 20 : total;
        System.out.println("Toplam Tutar " + total);

    }
}
