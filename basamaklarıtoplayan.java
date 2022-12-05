import java.util.Scanner;
public class basamaklarıtoplayan {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Sayı Giriniz:");
                int number = input.nextInt();
                int basValue,basSum=0;
                int tempnmbr=number;
                while(number != 0){
                    basValue = number % 10;
                    basSum += basValue;
                    number /= 10;
                }
                System.out.println(tempnmbr+" sayısının basamakları toplamı = "+basSum);


    }
}
