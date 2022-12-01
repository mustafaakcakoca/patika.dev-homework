import java.util.Scanner;

public class ortalama {
            public static void main(String[] args) {
               int sonuc, k,i=0;
                Scanner sayi=new Scanner(System.in);

                System.out.print("Bir Sayı Girin : ");
                k= sayi.nextInt();
                int ortalama=0;
                int sayiAdet=0;

                    while (i<=k){
                        i++;
                        if(i%3==0&&i%4==0){
                            ortalama+=i;
                            sayiAdet++;
                        }
                    }
                 sonuc=ortalama/(sayiAdet - 1);
                System.out.print("Sayıların Ortalaması : " + sonuc);
            }
        }


