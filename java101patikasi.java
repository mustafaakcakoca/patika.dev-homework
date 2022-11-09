import java.util.Scanner;
public class java101patikasi {
    public static void main(String[] args) {
        //Değişkenleri oluştur.

int mat,fizik,kimya,turkce,tarih,muzik;

//Scanner sınıfımızı tanımladık
        Scanner inp=new Scanner(System.in);
        //Kullanıcıdan verileri al
        System.out.println("Matematik Notunuz : ");
        mat= inp.nextInt();
        System.out.println("Fizik Notunuz : ");
        fizik=inp.nextInt();
        System.out.println("Kimya Notunuz : ");
        kimya= inp.nextInt();
        System.out.println("Türkçe Notunuz : ");
        turkce= inp.nextInt();
        System.out.println("Tarih Notunuz : ");
        tarih= inp.nextInt();
        System.out.println("Müzik Notunuz : ");
        muzik=inp.nextInt();

        int toplam=(mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc= toplam / 6;
        String str = sonuc > 60 ? "Sınıfı geçti" :  "Sınıfta kaldı";
        System.out.println(str);

        System.out.println("Ortalamanız "+ sonuc);





    }
}
