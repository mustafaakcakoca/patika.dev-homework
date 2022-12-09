import java.util.Scanner;

public class findmaxminnumb {
    public static void main(String[] args) {

        int i, number, max = 0, min = 0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Sayı Gireceksiniz : ");
        int n = scan.nextInt();

        for (i = 1; i <= n; i++) {
            System.out.print(i + ".Sayı : ");
            number = scan.nextInt();

            if (i == 1) {
                min = number;
                max = number;
            }
            if (number < min) {
                min=number;

            } else if (number > max) {
                max=number;
            }
        }

        System.out.println("En Büyük Sayı :" + max);
        System.out.println("En Küçük Sayı :" + min);

    }
}









