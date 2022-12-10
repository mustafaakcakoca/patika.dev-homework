import java.util.Scanner;

public class tersUcgen {
    public static void main(String[] args) {

        int i = 1;
        Scanner scan = new Scanner(System.in);
        System.out.print("Basamak Giriniz  : ");
        int n = scan.nextInt();

        for (i = n; i >= 1; i--) {
        for(int k=0;k<n-i;k++){
            System.out.print(" ");
        }
        for(int j=2*i-1;j>0;j--){
            System.out.print("*");
        }
            System.out.println();
            }


        }
    }









