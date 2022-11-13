import java.util.Scanner;
public class ucgenalanihesaplama {
    public static void main(String[] args) {
        //Degiskenleri olusturalim
int a;
int b;
int c;
double u;
double alan;
double cevre;


//Kullanicidan verileri alalim
Scanner girdi = new Scanner(System.in);
System.out.println("1.Kenarı Giriniz : ");
    a= girdi.nextInt();
        System.out.println("2.Kenarı Giriniz");
        b= girdi.nextInt();
        System.out.println("3.Kenarı Giriniz");
        c= girdi.nextInt();
    //Programın hesaplamasını sağlayalım.
        u= (a+b+c) / 2;
        cevre= u*2;
        alan=Math.sqrt((u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin cevresi" + cevre);
        System.out.println("Ücgenin Alanı"  + alan);



    }
}
