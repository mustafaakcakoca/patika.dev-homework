import java.util.Scanner;

public class dordveikikati {
    public static void main(String[] args) {
        int n, total = 0;
        Scanner numb = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Girin : ");
            n = numb.nextInt();
            if (n%4==0) {
                total+=n;

            }

            }while (n % 2 == 0);

        System.out.print("Toplam : " + total);
        }
    }

