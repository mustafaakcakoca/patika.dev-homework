import java.util.Scanner;

public class elmastanucgen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir Basamak Sayısı Girin : ");
        int n = scan.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int k = 1; k <= (n - i); k++) {
                System.out.print(" ");
                }
                for (int l = 1; l <= (2 * i - 1); l++) {
                    System.out.print("*");
                }
                System.out.println();

            }
            for (int i = n - 1; i >= 1; i--) {
                for (int k = n; k > i; k--) {
                    System.out.print(" ");
                }
                for (int l = 1; l <= (2 * i - 1); l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }


