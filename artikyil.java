import java.util.Scanner;
public class artikyil {
    public static void main(String[] args) {
        int year;
        Scanner sc=new Scanner(System.in);

        System.out.print("Yıl Giriniz : ");
        year= sc.nextInt();

        if(year%100==0) {
            if (year % 400 == 0) {
                System.out.print(year + " Bir Artık Yıldır ");
            } else {
                System.out.print(year + " Bir Artık Yıl Değildir");
            }
        }else if(year % 4 ==0){
            System.out.print(year + " Bir Artık Yıldır");
        }else {
            System.out.println(year + " Bir Artık Yıl Değildir");
        }
    }
}
