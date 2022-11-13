import java.util.Scanner;

public class vucutkitleendeksi {
    public static void main(String[] args) {
int kg;
double boy;
double indeks;

Scanner inp=new Scanner(System.in);
        System.out.println("Lütfen Kilonuzu giriniz : ");
        kg=inp.nextInt();
        System.out.println("Lütfen Boyunuzu(metre cinsinden)giriniz : ");
boy= inp.nextDouble();
indeks= kg / (boy * boy);
        System.out.println("Vücut Kitle İndeksiniz : " + indeks);



    }
}
