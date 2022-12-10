import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {

        int a=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz : ");
        int n = scan.nextInt();

        for (int i = 1; i < n; i++) {
            if(n % i==0){
                a+=i;

            }
        }if(a==n){
            System.out.print(n+" Mükemmel Bir Sayıdır.");
        }else{
            System.out.println(n+ " Mükemmel Bir Sayı Değildir.");
        }



    }
}









