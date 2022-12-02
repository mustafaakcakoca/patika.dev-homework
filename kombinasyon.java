import java.util.Scanner;
public class kombinasyon {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("C(n,r) için\nn değerini giriniz:");
        int n = scan.nextInt();
        System.out.print("r değerini giriniz:");
        int r = scan.nextInt();
        if(r>n){
            int temp=r;
            r=n;
            n=temp;
        }
        System.out.print("C("+n+","+r+") = "+calculateCombination(n,r));


    }
   public static double calculateCombination(int n,int r ){
        int nfac=calculatefactorial(n);
        int rfac=calculatefactorial(r);
        int nrfac=calculatefactorial(n-r);
        return (nfac/(nrfac * rfac));

   }
   public static int calculatefactorial(int i){
if(i==0) {
    return 1;
}int fac=1;
while(i>=1){
    fac*=i;
    i-=1;
}return fac;
   }
    }
