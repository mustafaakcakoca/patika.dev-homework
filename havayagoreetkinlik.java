import java.util.Scanner;
public class havayagoreetkinlik {
    public static void main(String[] args) {
        int heat;
        Scanner inp= new Scanner(System.in);
        System.out.println("Sıcaklık Değerini Giriniz : ");
        heat= inp.nextInt();
        if (heat<5) {
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }else if(heat>5 && heat<15) {
            System.out.println("Sinemaya Gidebilirsiniz.");
        }else if(heat>15 && heat < 25) {
            System.out.println("Pikniğe Gidebilirsiniz.");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz.");
        }
    }
}
