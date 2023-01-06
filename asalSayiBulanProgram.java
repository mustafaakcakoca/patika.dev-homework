package patikahomewrk;
import java.util.Scanner;
public class asalSayiBulanProgram {

    static void asal() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Sayı Giriniz : ");
        int numb= scan.nextInt();
        boolean control=true;
        for(int i=2;i<numb;i++){
            if(numb % i == 0){
                control=false;
                break;
            }
        }
        System.out.println(control==true ? numb+ " Asaldır." : numb + " Asal Değildir.");
    }
        public static void main (String[]args){
        asal();


    }
}