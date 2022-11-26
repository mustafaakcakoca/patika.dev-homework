import java.util.Scanner;
public class Sinifigecmedurumu {
    public static void main(String[] args) {
        int turkce, kimya, matematik, muzik, fizik;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik Notunu Giriniz : ");
        matematik = inp.nextInt();
        System.out.print("Türkçe Notunu Giriniz : ");
        turkce = inp.nextInt();
        System.out.print("Fizik Notunu Giriniz : ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunu Giriniz : ");
        kimya = inp.nextInt();
        System.out.print("Müzik Notunu Giriniz : ");
        muzik = inp.nextInt();

        double ortalama = (matematik + turkce + fizik + kimya + muzik) / 5;


        if ((matematik < 0) && (matematik > 100) && (turkce < 0) && (turkce > 100) && (fizik < 0) && (fizik > 100)
                && (kimya < 0) && (kimya > 100) && (muzik < 0) && (muzik > 100)) {

        } else {
            System.out.println("Girilen Notlar 0 ile 100 arasında olmalıdır\n Yeniden Deneyiniz!");
            if ((ortalama > 100) && (ortalama < 0)) {
                System.out.println("Yanlış Giden Birşeyler Var Lütfen Tekrar Deneyin");}
                if (ortalama >= 55) {
                    System.out.println("Tebrikler Sınıfı Geçtiniz! \n Ortalamanız :" + ortalama);
                } else if(ortalama <=0)  {
                    System.out.println("Üzgünüm Sınıfta Kaldınız! \n Ortalamanız :" + ortalama);}

                    if ((ortalama > 100) && (ortalama < 0)) {
                        System.out.println("Yanlış Giden Birşeyler Var Lütfen Tekrar Deneyin");

                    }


                }

        }
    }



