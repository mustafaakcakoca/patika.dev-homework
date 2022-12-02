import java.util.Scanner;

public class usprogram {
    public static void main(String[] args) {
        int n,k;
        //3^4=3*3*3*3
        Scanner scan=new Scanner(System.in);

        System.out.print("Üssü Hesaplanacak Sayıyı Giriniz : ");
        n= scan.nextInt();
        System.out.print("Üs Olacak sayıyı giriniz : ");
        k= scan.nextInt();
        int total=1;

        for(int i=1;i<=k;i++){
        total*=n;
            System.out.println("Cevap : " + total);
        }
    }
}
