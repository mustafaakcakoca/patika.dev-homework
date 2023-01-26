import java.util.Scanner;
import java.util.Arrays;
public class CloseToMinAndMax {
        public static void main(String[] args) {
            int nearMin;
            int nearMax;
            Scanner input = new Scanner(System.in);
            System.out.print("Lütfen bir sayı giriniz :");
            int number = input.nextInt();
            int[] list = {15,12,788,1,-1,-778,2,0, number};
            System.out.println(Arrays.toString(list));

            Arrays.sort(list);
            int index = Arrays.binarySearch(list, number);
            nearMin = list[index-1];
            nearMax = list[index+1];

            System.out.println("Girilen sayıya en yakın küçük değer :" + nearMin);
            System.out.println("Girilen sayıya en yakın büyük değer :" + nearMax);
    }

    }



