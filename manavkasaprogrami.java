import java.util.Scanner;
public class manavkasaprogrami {
    public static void main(String[] args) {
        double armut=2.14;
        double elma= 3.67;
        double domates= 1.11;
        double muz=0.95;
        double patlican=5.00;
        double a,b,c,d,e,toplam;
        Scanner inp= new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        a= inp.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        b= inp.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        c= inp.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        d= inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? :");
        e= inp.nextDouble();
        toplam=((armut * a) + (elma * b) + (domates * c ) + (muz * d) + (patlican * e));
        System.out.print("Manav Tutarınız : " + toplam);
    }
}
