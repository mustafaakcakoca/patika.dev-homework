import java.util.Arrays;
import java.util.Scanner;
public class ElementOfArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Elemanlı Dizi oluşturmak istiyorsunuz ? : ");
        int size = scan.nextInt();

        int[] list = new int[size];

        for (int i = 0; i < list.length; i++) {
            System.out.print( (i + 1) + ".Elemanı Giriniz : ");
            list[i] = scan.nextInt();
        }
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
    }
}

